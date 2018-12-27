package codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 * @date 2018-10-19 10:30
 *
 *
 * It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?
 * Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.
 * If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.
 * Return the total figure the individual will receive as a string prefixed with "£" (= "\u00A3", JS and Java) or "$" (C#, C++, Ruby, Clojure, Elixir, PHP and Python, Haskell).
 */
public class BonusTime {
    public static String bonusTime(final int salary, final boolean bonus) {
        // show me the code!

        return "\u00A3" + String.valueOf(bonus ? salary*10 : salary);
    }

    public static void main(String[] args) {
        Print.print(bonusTime(67890, true));
    }
}
