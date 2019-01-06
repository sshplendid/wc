package count;

import java.util.Arrays;

public class WordCounter implements Counter {

    @Override
    public long count(String input) {
        return Arrays.stream(input.split("\\s"))
                .filter(w -> !w.equals(""))
                .count();
    }
}
