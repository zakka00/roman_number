package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class IntegerToRomanTest {
    @Test
    public void testPrimiTreNumeri() {
        IntegerToRoman i = new IntegerToRoman();
        assertEquals("I", i.convert(1));
        assertEquals("II", i.convert(2));
        assertEquals("III", i.convert(3));
    }
    @Test
    public void testPrimiSeiNumeri() {
        IntegerToRoman i = new IntegerToRoman();
        assertEquals("IV", i.convert(4));
        assertEquals("V", i.convert(5));
        assertEquals("VI", i.convert(6));
    }
    @Test
    public void testPrimiDieciNumeri() {
        IntegerToRoman i = new IntegerToRoman();
        assertEquals("VII", i.convert(7));
        assertEquals("VIII", i.convert(8));
        assertEquals("IX", i.convert(9));
        assertEquals("X", i.convert(10));
    }
    @Test
    public void testPrimiVentiNumeri() {
        IntegerToRoman i = new IntegerToRoman();
        assertEquals("XV", i.convert(15));
        assertEquals("XX", i.convert(20));
        assertEquals("XIX", i.convert(19));
        assertEquals("XVII", i.convert(17));
    }
    @Test
    public void testPrimiCinquantaNumeri() {
        IntegerToRoman i = new IntegerToRoman();
        assertEquals("XX", i.convert(20));
        assertEquals("XXV", i.convert(25));
        assertEquals("XXIX", i.convert(29));
        assertEquals("XXX", i.convert(30));
        assertEquals("XXXIX", i.convert(39));
        assertEquals("XL", i.convert(40));
    }
    @Test
    public void testNumeriDaCinquantaACento() {
        IntegerToRoman i = new IntegerToRoman();
        assertEquals("L", i.convert(50));
        assertEquals("LI", i.convert(51));
        assertEquals("LIX", i.convert(59));
        assertEquals("LX", i.convert(60));
        assertEquals("LXX", i.convert(70));
        assertEquals("LXXX", i.convert(80));
        assertEquals("XC", i.convert(90));
        assertEquals("XCIX", i.convert(99));
        assertEquals("C", i.convert(100));
    }
    @Test
    public void testNumeriDaCentoCinquecento() {
        IntegerToRoman i = new IntegerToRoman();
        assertEquals("CXLIX", i.convert(149));
        assertEquals("CDXCIX", i.convert(499));
        assertEquals("CDL", i.convert(450));
        assertEquals("CCC", i.convert(300));
        assertEquals("CD", i.convert(400));
        assertEquals("CCLXXXVIII", i.convert(288));
        assertEquals("CCCXLVII", i.convert(347));
        assertEquals("CDXXV", i.convert(425));
        assertEquals("CI", i.convert(101));
    }

    @Test
    public void testNumeriDaCinquecentoAMille_Estesi() {
        IntegerToRoman i = new IntegerToRoman();
        // Numeri tondi
        assertEquals("D", i.convert(500));
        assertEquals("DC", i.convert(600));
        assertEquals("DCC", i.convert(700));
        assertEquals("DCCC", i.convert(800));
        assertEquals("CM", i.convert(900));
        assertEquals("M", i.convert(1000));

        // Estremi e casi con tutte le cifre
        assertEquals("DI", i.convert(501));
        assertEquals("DL", i.convert(550));
        assertEquals("DCXLIV", i.convert(644));
        assertEquals("DCCLXXXIX", i.convert(789));
        assertEquals("DCCCXC", i.convert(890));
        assertEquals("CMXC", i.convert(990));
        assertEquals("CMXCIX", i.convert(999));

        // Casi intermedi
        assertEquals("CMLXIX", i.convert(969));
        assertEquals("DCLXVI", i.convert(666));
        assertEquals("DCCXX", i.convert(720));
        assertEquals("DCCCXLV", i.convert(845));
        assertEquals("CML", i.convert(950));
        assertEquals("CMLXXXVIII", i.convert(988));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfBounds() {
        IntegerToRoman.convert(10000);
        IntegerToRoman.convert(-1);
        IntegerToRoman.convert(0);
        IntegerToRoman.convert(-100);
        IntegerToRoman.convert(10001);
        IntegerToRoman.convert(-11);
    }
}
