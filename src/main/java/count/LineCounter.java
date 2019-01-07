package count;

public class LineCounter implements Counter {
    @Override
    public long count(String input) {
        return (long) input.split("\\n").length;
    }
}
