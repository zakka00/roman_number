////////////////////////////////////////////////////////////////////
// [Edis] [Hodja] [2116422]
// [Zakaria] [Laoud] [2113196]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 50) {
            throw new IllegalArgumentException("Number must be between 1 and 50");
        }

        String[] decine = {"", "X", "XX", "XXX", "XL", "L"};
        String[] unita = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        
        return decine[number / 10] + unita[number % 10];
    }
}