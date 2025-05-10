////////////////////////////////////////////////////////////////////
// [Edis] [Hodja] [2116422]
// [Zakaria] [Laoud] [2113196]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 20) {
            throw new IllegalArgumentException("Number must be between 1 and 20");
        }

        String[] romanNumerals = {
            "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX"
        };
        
        return romanNumerals[number - 1];
    }
}