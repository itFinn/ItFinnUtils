package com.itfinn.codeWars;

import com.itfinn.utils.base.Print;

/**
 * @author xiefei
 */
public class Fighter_winner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        Fighter a=fighter1, b=fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            a = fighter2; b = fighter1;
        }
        while (true) {
            if ((b.health -= a.damagePerAttack) <= 0) return a.name;  // a wins
            if ((a.health -= b.damagePerAttack) <= 0) return b.name;  // b wins
        }
    }

    public static void main(String[] args) {
        Print.print(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Lew"));
        Print.print(declareWinner(new Fighter("Lew", 10, 2),new Fighter("Harry", 5, 4), "Harry"));
        Print.print(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harry"));
        Print.print(declareWinner(new Fighter("Harald", 20, 5), new Fighter("Harry", 5, 4), "Harald"));
        Print.print(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry"));
        Print.print(declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Harald"));
    }
}
