import org.junit.Test;

import static org.junit.Assert.*;

public class WcTests {
    @Test
    public void WcTest() {
        Wc.run();
    }

    @Test
    public void testFindSeparator_newline() {
        String given = "hello world\njava kotlin scala\napple banana carrot";
        int[] actual = Wc.findSeparator(given, '\n');

        assertEquals(2, actual[0]);
    }
    @Test
    public void testFindSeparator_newline2() {
        String given = "hello world\njava kotlin scala";
        int[] actual = Wc.findSeparator(given, '\n');

        assertEquals(1, actual[0]);
    }

    @Test
    public void testWhiteSpaceCharater() {
        String s = "hello world!\napple";
        for(char c : s.toCharArray()) {
            System.out.println(c+0);
        }
    }
    @Test
    public void testFindSeparator_word() {
        String given = "hello world\njava kotlin scala\napple banana carrot";
        int[] actual = Wc.findSeparator(given, (char)32);

        assertEquals(8, actual[1]);
    }
    @Test
    public void testFindSeparator_word2() {
        String given = "hello world\njava kotlin scala";
        int[] actual = Wc.findSeparator(given, (char) 32);

        assertEquals(5, actual[1]);
    }

}
