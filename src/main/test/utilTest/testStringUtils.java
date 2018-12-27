package utilTest;

import com.itfinn.utils.base.Print;
import com.itfinn.utils.base.StringUtil;

/**
 * @author itFinn.com
 * @date 2018-03-07 10:29
 */
public class testStringUtils {
    public static void main(String[] args) {
        Print.print("将中间带下划线的字符串转换为像java驼峰式字符串。" + '\n' + "--:" +
                StringUtil.underlineToJavaString("keep_think_different"));

        Print.print("将像java驼峰式字符串转换为中间带下划线的字符串" + '\n' + "--:" +
                StringUtil.javaStringToUnderline("KeepThinkDifferent"));

        Print.print("进行tostring操作，如果传入的是null，返回空字符串" + '\n' + "--:" +
                StringUtil.toString("utilTest") + '\t' +
                StringUtil.toString(null));

        Print.print("只从源字符串中移除指定开头子字符串" + '\n' + "--:" +
                StringUtil.removeStart("www.itFinn.com", "www."));

        Print.print("只从源字符串中移除指定结尾的子字符串." + '\n' + "--:" +
                StringUtil.removeEnd("www.itFinn.com", ".com"));

        Print.print("将一个字符串重复N次" + '\n' + "--:" +
                StringUtil.repeat("abc", ",", 3));

        Print.print("反转字符串" + '\n' + "--:" +
                StringUtil.reverse("keep_think_different"));

        Print.print("转换为字符串，每个元素用separator隔开" + '\n' + "--:" +
                "");
    }
}
