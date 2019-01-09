package count;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LineCounterTests {

    private LineCounter lc;

    @Before
    public void setUp() {
        this.lc = new LineCounter();
    }

    @Test
    public void whenOneLineIsGiven_thenReturn1() {
        String given = "Hello, World!";

        assertEquals(1, lc.count(given));
    }

    @Test
    public void whenMultipleLinesAreGiven_thenReturn3() {
        String given = "Hello, World!\napple banana carrot\nwhat a lovely day!";

        assertEquals(3, lc.count(given));
    }
    @Test
    public void whenEmptyLineIsGiven_thenReturn1() {
        String given = "\n";

        assertEquals(1, lc.count(given));
    }

    @Test
    public void whenMultipleEmptyLinesAreGiven_thenReturn1() {
        String given = "\n\n\n";
        assertEquals(4, lc.count(given));
    }

    @Test
    public void whenEmptyLInesAreGiven_thenReturn0() {
        String given = "\n\n\n";

        assertEquals(0, given.split("\n").length);
    }

}
