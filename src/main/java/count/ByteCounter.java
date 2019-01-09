package count;

public class ByteCounter implements Counter {
    @Override
    public long count(String input) {
        return input.getBytes().length;
    }
}
