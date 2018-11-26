package com.itfinn.utils.encrypt;

import com.itfinn.utils.base.StringUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * MD5加密
 *
 * @author itFinn.com
 * @date 2018-03-05 17:10
 */
class MD5Utils {
    protected final static String MD5_KEY = "MD5";
    protected final static String SHA_KEY = "SHA1";

    protected static char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    protected static MessageDigest messagedigest = null;

    protected static String encrypt(String value, String key) {
        try {
            // 拿到一个MD5转换器（如果想要SHA1参数换成”SHA1”）
            MessageDigest messageDigest = MessageDigest.getInstance(key);
            // 输入的字符串转换成字节数组
            byte[] inputByteArray = value.getBytes();
            // inputByteArray是输入字符串转换得到的字节数组
            messageDigest.update(inputByteArray);
            // 转换并返回结果，也是字节数组，包含16个元素
            byte[] resultByteArray = messageDigest.digest();
            // 字符数组转换成字符串返回
            return byteArrayToHex(resultByteArray);
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
    }

    private static String byteArrayToHex(byte[] byteArray) {

        // 首先初始化一个字符数组，用来存放每个16进制字符
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};
        // new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））
        char[] resultCharArray = new char[byteArray.length * 2];
        // 遍历字节数组，通过位运算（位运算效率高），转换成字符放到字符数组中去
        int index = 0;
        for (byte b : byteArray) {
            resultCharArray[index++] = hexDigits[b >>> 4 & 0xf];
            resultCharArray[index++] = hexDigits[b & 0xf];
        }
        // 字符数组组合成字符串返回
        return new String(resultCharArray);
    }

    static {
        try {
            messagedigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException nsaex) {
            System.err.println(MD5Utils.class.getName() + "初始化失败，MessageDigest不支持MD5Utils。");
            nsaex.printStackTrace();
        }
    }

    /**
     * 功能：加盐版的MD5.返回格式为MD5(密码+{盐值})
     *
     * @param password 密码
     * @param salt     盐值
     * @return String
     */
    public static String getMD5StringWithSalt(String password, String salt) {
        if (password == null) {
            throw new IllegalArgumentException("password不能为null");
        }
        if (StringUtil.isEmpty(salt)) {
            throw new IllegalArgumentException("salt不能为空");
        }
        if ((salt.toString().lastIndexOf("{") != -1) || (salt.toString().lastIndexOf("}") != -1)) {
            throw new IllegalArgumentException("salt中不能包含 { 或者 }");
        }
        return getMD5String(password + "{" + salt.toString() + "}");
    }

    /**
     * 功能：得到文件的md5值。
     *
     * @param file 文件。
     * @return String
     * @throws IOException 读取文件IO异常时。
     */
    public static String getFileMD5String(File file) throws IOException {
        FileInputStream in = new FileInputStream(file);
        FileChannel ch = in.getChannel();
        MappedByteBuffer byteBuffer = ch.map(FileChannel.MapMode.READ_ONLY, 0,
                file.length());
        messagedigest.update(byteBuffer);
        return bufferToHex(messagedigest.digest());
    }

    /**
     * 功能：得到一个字符串的MD5值。
     *
     * @param str 字符串
     * @return String
     */
    public static String getMD5String(String str) {
        return getMD5String(str.getBytes());
    }

    private static String getMD5String(byte[] bytes) {
        messagedigest.update(bytes);
        return bufferToHex(messagedigest.digest());
    }

    private static String bufferToHex(byte bytes[]) {
        return bufferToHex(bytes, 0, bytes.length);
    }

    private static String bufferToHex(byte bytes[], int m, int n) {
        StringBuffer stringbuffer = new StringBuffer(2 * n);
        int k = m + n;
        for (int l = m; l < k; l++) {
            appendHexPair(bytes[l], stringbuffer);
        }
        return stringbuffer.toString();
    }

    private static void appendHexPair(byte bt, StringBuffer stringbuffer) {
        char c0 = hexDigits[(bt & 0xf0) >> 4];
        char c1 = hexDigits[bt & 0xf];
        stringbuffer.append(c0);
        stringbuffer.append(c1);
    }
}
