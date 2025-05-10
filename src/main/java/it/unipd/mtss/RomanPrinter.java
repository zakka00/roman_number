////////////////////////////////////////////////////////////////////
// [Edis] [Hodja] [2116422]
// [Zakaria] [Laoud] [2113196]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int value) { //value è un numero intero e dunque non può essere un carattere dell'alfabeto o nullo
        return printAsciiArt(IntegerToRoman.convert(value));
    }

    private static String printAsciiArt(String romanDigits) {
        StringBuilder result = new StringBuilder();
        final int ROWS = 6;

        // Rappresentazione ASCII per ogni cifra romana (M, D, C, L, X, V, I)
        String[][] digitPatterns = {
            { // M
                " __  __ ",
                "|  \\/  |",
                "| \\  / |",
                "| |\\/| |",
                "| |  | |",
                "|_|  |_|"
            },
            { // D
                " _____  ",
                "|  __ \\ ",
                "| |  | |",
                "| |  | |",
                "| |__| |",
                "|_____/ "
            },
            { // C
                "  _____ ",
                " / ____|",
                "| |     ",
                "| |     ",
                "| |____ ",
                " \\_____|"
            },
            { // L
                "  _      ",
                " | |     ",
                " | |     ",
                " | |     ",
                " | |____ ",
                " |______|"
            },
            { // X
                "__   __",
                "\\ \\ / /",
                " \\ V / ",
                "  > <  ",
                " / . \\ ",
                "/_/ \\_\\"
            },
            { // V
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    "
            },
            { // I
                " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|"
            }
        };

        String romanLetters = "MDCLXVI";

        for (int row = 0; row < ROWS; row++) {
            for (int i = 0; i < romanDigits.length(); i++) {
                char digit = romanDigits.charAt(i);
                int index = romanLetters.indexOf(digit);
                if (index != -1) {
                    result.append(digitPatterns[index][row]);
                    if (i < romanDigits.length() - 1) {
                        result.append(" ");  // Spazio tra simboli
                    }
                }
            }
            result.append(System.lineSeparator());
        }

        return result.toString();
    }
}
