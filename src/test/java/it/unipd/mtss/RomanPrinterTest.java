package it.unipd.mtss;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

//import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        // Test con I (1)
        assertEquals(
            " _____ \n" +
            "|_   _|\n" +
            "  | |  \n" +
            "  | |  \n" +
            " _| |_ \n" +
            "|_____|\n",
            RomanPrinter.print(1));

        // Test con II (2)
        assertEquals(
            " _____   _____ \n" +
            "|_   _| |_   _|\n" +
            "  | |     | |  \n" +
            "  | |     | |  \n" +
            " _| |_   _| |_ \n" +
            "|_____| |_____|\n",
            RomanPrinter.print(2));

        // Test con III (3)
        assertEquals(
            " _____   _____   _____ \n" +
            "|_   _| |_   _| |_   _|\n" +
            "  | |     | |     | |  \n" +
            "  | |     | |     | |  \n" +
            " _| |_   _| |_   _| |_ \n" +
            "|_____| |_____| |_____|\n",
            RomanPrinter.print(3));

        // Test con CII (102)
        assertEquals(
            "  _____   _____   _____ \n" +
            " / ____| |_   _| |_   _|\n" +
            "| |        | |     | |  \n" +
            "| |        | |     | |  \n" +
            "| |____   _| |_   _| |_ \n" +
            " \\_____| |_____| |_____|\n",
            RomanPrinter.print(102));

        // Test con M (1000)
        assertEquals(
            " __  __ \n" +
            "|  \\/  |\n" +
            "| \\  / |\n" +
            "| |\\/| |\n" +
            "| |  | |\n" +
            "|_|  |_|\n",
            RomanPrinter.print(1000));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfBounds() {
        IntegerToRoman.convert(10000);
        IntegerToRoman.convert(-1);
        IntegerToRoman.convert(0);
        IntegerToRoman.convert(-100);
        IntegerToRoman.convert(10001);
        IntegerToRoman.convert(-11);
        //IntegerToRoman.convert("A");      Siccome il metodo print richiede un int come parametro, ed esso non può essere nè un carattere nè nullo,
        //IntegerToRoman.convert(null);     possiamo concludere che non si trattano di test case che ricadono sul testing della classe RomanPrinter.
    }   
}