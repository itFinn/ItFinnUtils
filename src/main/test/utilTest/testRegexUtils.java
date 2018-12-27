package utilTest;

import com.itfinn.utils.base.Print;
import com.itfinn.utils.base.RegexUtils;

/**
 * @author itFinn.com
 * @date 2018-03-07 10:13
 */
public class testRegexUtils {
    public static void main(String[] args) {
        Print.print(RegexUtils.isEmail("123@123.com"));
        Print.print(RegexUtils.isChinese("123@123.com"));
        Print.print(RegexUtils.isDouble("123456.21"));
        Print.print(RegexUtils.isInteger("321231"));
    }
}
