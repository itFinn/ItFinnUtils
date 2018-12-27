package utilTest;

import com.itfinn.utils.base.Print;
import com.itfinn.utils.base.ValidateHelper;

/**
 * @author itFinn.com
 * @date 2018-03-07 10:34
 */
public class testValidateHelper {
    public static void main(String[] args) {
        Print.print(ValidateHelper.isEmpty("  "));
        Print.print(ValidateHelper.isEmpty("123"));
    }
}
