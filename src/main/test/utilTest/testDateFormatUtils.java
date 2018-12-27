package utilTest;

import com.itfinn.utils.base.Print;
import com.itfinn.utils.date.DateFormatUtils;

/**
 * @author itFinn.com
 * @date 2018-03-07 14:02
 */
public class testDateFormatUtils {
    public static void main(String[] args) {
        Print.print(DateFormatUtils.formatString("2018-03-07 14:03:38"));

        Print.print(DateFormatUtils.formatDate("20180307140338"));
    }
}
