////////////////////////////////////////////////////////////////////
// [Edis] [Hodja] [2116422]
// [Zakaria] [Laoud] [2113196]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number){
        String result = "";
        if (number < 1 || number > 3) {
            throw new IllegalArgumentException("Number out of bounds");
        }
        while (number > 0) {
            result += "I";
            number--;
        }
        return result;
    }
}
