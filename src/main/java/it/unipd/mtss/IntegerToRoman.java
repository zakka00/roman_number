////////////////////////////////////////////////////////////////////
// [Edis] [Hodja] [2116422]
// [Zakaria] [Laoud] [2113196]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 6) {
            throw new IllegalArgumentException("Number out of bounds");
        }

        String[] roman = {"I", "II", "III", "IV", "V", "VI"};
        return roman[number - 1];
    }
}
