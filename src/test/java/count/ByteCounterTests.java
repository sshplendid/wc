package count;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ByteCounterTests {

    private ByteCounter bc;

    @Before
    public void setUp() {
        bc = new ByteCounter();
    }

    @Test
    public void whenEmptyStringIsGiven_thenLengthIs0() {
        assertEquals(0, "".length());
    }
    @Test
    public void whenEmptyStringIsGiven_thenLengthOfBytesIs0() {
        assertEquals(0, "".getBytes().length);
    }
    @Test
    public void whenEmptyStringIsGiven_thenReturn0() {
        String given = "";

        assertEquals(0, bc.count(given));
    }


    @Test
    public void when5CharactersAreGiven_thenReturn5() {
        String given = "apple";

        assertEquals(5, bc.count(given));
    }

    @Test
    public void when5CharactersWithCRAreGiven_thenReturn5() {
        String given = "apple\n";

        assertEquals(6, bc.count(given));
    }

    @Test
    public void whenMultipleLInesAreGiven_thenReturnGreaterThan1() {
        String given = "Apple\nBanana";

        assertEquals(12, bc.count(given));
    }
}
