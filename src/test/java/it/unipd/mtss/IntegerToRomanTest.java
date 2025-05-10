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
    
    @Test(expected = IllegalArgumentException.class)
    public void testOutOfBounds() {
        IntegerToRoman.convert(-10);
        IntegerToRoman.convert(5);
    }
}
