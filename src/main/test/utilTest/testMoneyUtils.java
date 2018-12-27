package utilTest;

import com.itfinn.utils.base.MoneyUtils;
import com.itfinn.utils.base.Print;

import java.math.BigDecimal;

/**
 * @author itFinn.com
 * @date 2018-03-07 10:06
 */
public class testMoneyUtils {
    public static void main(String[] args) {

        System.out.println(MoneyUtils.number2CNMontray("123456791"));
        Print.print(MoneyUtils.number2CNMontray(String.valueOf(1234567911)));
        Print.print(MoneyUtils.accountantMoney(BigDecimal.valueOf(112233445)));
    }
}
