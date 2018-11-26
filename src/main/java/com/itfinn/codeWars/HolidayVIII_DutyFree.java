package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

import java.math.BigDecimal;

/**
 * @author xiefei
 * @date 2018-10-19 10:39
 *
 * Holiday VIII - Duty Free
 *
 * The purpose of this kata is to work out just how many bottles of duty free whiskey you would have to buy such that the saving over the normal high street price would effectively cover the cost of your holiday.
 * You will be given the high street price (normPrice), the duty free discount (discount) and the cost of the holiday.
 * For example, if a bottle cost £10 normally and the discount in duty free was 10%, you would save £1 per bottle. If your holiday cost £500, the answer you should return would be 500.
 * All inputs will be integers. Please return an integer. Round down.
 */
public class HolidayVIII_DutyFree {

    public static int dutyFree(int normPrice, int discount, int hol) {

        BigDecimal np = new BigDecimal(Integer.valueOf(normPrice));
        BigDecimal dc = new BigDecimal(Integer.valueOf(discount));
        BigDecimal hl = new BigDecimal(Integer.valueOf(hol));

        BigDecimal priceNum = hl.divide(np.multiply(dc.divide(BigDecimal.valueOf(100))), 2, BigDecimal.ROUND_DOWN);

        int num = priceNum.intValue();
        return num;

    }

    public static void main(String[] args) {
        Print.print(dutyFree(12,50,1000)); //166
        Print.print(dutyFree(17,10,500)); //294
        Print.print(dutyFree(24,35,3000)); //357
    }
}
