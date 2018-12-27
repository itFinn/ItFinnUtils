package utilTest;

import com.itfinn.utils.base.IdCardValidator;
import com.itfinn.utils.base.Print;

/**
 * @author itFinn.com
 * @date 2018-03-07 9:45
 */
public class testIdCardValid {
    public static void main(String[] args) {
        String idCard = "360681199304139077";

        IdCardValidator valida = new IdCardValidator();

        Print.print(valida.isValidatedAllIdcard(idCard));
    }
}
