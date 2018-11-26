package com.itfinn.utils.base;


import com.mysql.jdbc.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUtil {


    /**
     * 验证qq号
     *
     * @param qqStr
     * @return
     */
    public static boolean isQQ(String qqStr) {
        boolean isFlag = false;
        if (!StringUtils.isEmptyOrWhitespaceOnly(qqStr)) {
            String regex = "[1-9][0-9]{4,}";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(qqStr);
            isFlag = m.matches();
        }
        return isFlag;
    }

    /**
     * 验证email
     *
     * @param emailStr
     * @return
     */
    public static boolean isEmail(String emailStr) {
        boolean isFlag = false;
        if (!StringUtils.isEmptyOrWhitespaceOnly(emailStr)) {
            String regex = "\\w+([-+.]\\w+)*@\\w+([-.]\\w+)+";//邮箱
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(emailStr);
            isFlag = m.matches();
        }
        return isFlag;
    }

    /**
     * 验证电话号码
     *
     * @param phoneStr
     * @return
     */
    public static boolean isPhone(String phoneStr) {
        boolean isFlag = false;
        if (!StringUtils.isEmptyOrWhitespaceOnly(phoneStr)) {
            //3-4为区号；电话号码为3-8位；手机号为13,14,15,16,17,18,19号段，为11位
            String regex = "([0-9]{3,4}-[0-9]{3,8})|([0-9]{3,8})|(([0-9]{3,4})[0-9]{3,8})|(1[3|4|5|6|7|8|9][0-9]{9})";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(phoneStr);
            isFlag = m.matches();
        }
        return isFlag;
    }

    /**
     * 验证手机号
     *
     * @param telephone
     * @return
     */
    public static boolean isMobile(String telephone) {
        boolean isFlag = false;
        if (!StringUtils.isEmptyOrWhitespaceOnly(telephone)) {
            String regex = "1[3|4|5|6|7|8|9][0-9]{9}";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(telephone);
            isFlag = m.matches();
        }
        return isFlag;
    }

    /**
     * 验证汉字
     *
     * @param gbkStr
     * @return
     */
    public static boolean isGBK(String gbkStr) {
        boolean isFlag = false;
        if (!StringUtils.isEmptyOrWhitespaceOnly(gbkStr)) {
            String regex = "[\u4e00-\u9fa5]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher m = pattern.matcher(gbkStr);
            isFlag = m.matches();
        }
        return isFlag;
    }

    /**
     * 验证是否为数字
     *
     * @param numberStr
     * @return
     */
    public static boolean isNumber(String numberStr) {
        if (!StringUtils.isEmptyOrWhitespaceOnly(numberStr)) {
            //整数
            Pattern pattern1 = Pattern.compile("[1-9][0-9]*");
            //大于0的浮点数
            Pattern pattern2 = Pattern.compile("[1-9][0-9]*.[0-9]+");
            //小于0的浮点数
            Pattern pattern3 = Pattern.compile("0.[0-9]+");
            if (pattern1.matcher(numberStr).matches() || pattern2.matcher(numberStr).matches()
                    || pattern3.matcher(numberStr).matches()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 验证是否为整数
     *
     * @param numberStr
     * @return
     */
    public static boolean isInt(String numberStr) {
        if (!StringUtils.isEmptyOrWhitespaceOnly(numberStr) && numberStr.length() < 11) {
            Pattern pattern1 = Pattern.compile("[1-9][0-9]*|0");
            if (pattern1.matcher(numberStr).matches()) {
                return true;
            }
        }
        return false;

    }

    /**
     * 验证是否为整数数字组成
     *
     * @param numberStr
     * @return
     */
    public static boolean isNumberString(String numberStr) {
        if (!StringUtils.isEmptyOrWhitespaceOnly(numberStr)) {
            Pattern pattern1 = Pattern.compile("[0-9]+");
            if (pattern1.matcher(numberStr).matches()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 验证浮点数
     *
     * @param numberStr
     * @return
     */
    public static boolean isFloat(String numberStr) {
        if (!StringUtils.isEmptyOrWhitespaceOnly(numberStr)) {
            //小于0的浮点数
            Pattern pattern1 = Pattern.compile("0.[0-9]+");
            //大于0的浮点数
            Pattern pattern2 = Pattern.compile("[1-9][0-9]*.[0-9]+");
            if (pattern2.matcher(numberStr).matches() || pattern1.matcher(numberStr).matches()) {
                return true;
            }
        }
        return false;
    }

    /**
     * 功能：判断字符串是否为日期格式
     *
     * @param strDate
     * @return
     */
    public static boolean isDate(String strDate) {
        Pattern pattern = Pattern
                .compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");
        Matcher m = pattern.matcher(strDate);
        if (m.matches()) {
            return true;
        } else {
            return false;
        }
    }

}
