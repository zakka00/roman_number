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

    @Test(expected = IllegalArgumentException.class)
    public void testOutOfBounds() {
        IntegerToRoman.convert(-10);
        IntegerToRoman.convert(10);
    }
}
