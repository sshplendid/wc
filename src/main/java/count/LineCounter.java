package count;

import java.util.StringTokenizer;

public class LineCounter implements Counter {
    private StringTokenizer tokenizer;

    @Override
    public long count(String input) {
        this.tokenizer = new StringTokenizer(input, "\\n");
        return (long) tokenizer.countTokens();
    }
}
