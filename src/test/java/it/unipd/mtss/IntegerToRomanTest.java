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

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfBounds() {
        IntegerToRoman.convert(-10);
        IntegerToRoman.convert(55);
    }
}
