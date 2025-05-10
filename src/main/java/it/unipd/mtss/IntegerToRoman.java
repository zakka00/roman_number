////////////////////////////////////////////////////////////////////
// [Edis] [Hodja] [2116422]
// [Zakaria] [Laoud] [2113196]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 500) {
            throw new IllegalArgumentException("Number must be between 1 and 500");
        }

        String[] centinaia = {"", "C", "CC", "CCC", "CD", "D"};
        String[] decine =    {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] unita =     {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return centinaia[(number % 1000) / 100] + 
               decine[(number % 100) / 10] + 
               unita[number % 10];
    }
}