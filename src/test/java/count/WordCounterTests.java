package count;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTests {
    private WordCounter wc;

    @Before
    public void setUp() {
        wc = new WordCounter();
    }

    @Test
    public void when3WordsAreGiven_thenReturn3() {
        String given = "apple banana carrot";

        assertEquals(3, wc.count(given));
    }

    @Test
    public void when1WordIsGiven_thenReturn1() {
        String given = "apple";

        assertEquals(1, wc.count(given));
    }

    @Test
    public void whenEmptyInputIsGiven_thenReturn0() {
        String given = "";

        assertEquals(0, wc.count(given));
    }

    @Test
    public void whenMultipleLinesAreGiven_thenReturnMoreThan1() {
        String given = "Hello, World!\nWord Counter counts numbers.";

        assertEquals(6, wc.count(given));
    }

    @Test
    public void whenMultipleEmptyLinesAreGiven_thenReturnMoreThan1() {
        String given = "\n";

        assertEquals(0, wc.count(given));
    }
}
