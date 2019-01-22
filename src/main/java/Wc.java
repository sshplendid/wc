public class Wc {
    public static void run() {
        System.out.println("Hello, World!");
    }

    public static int[] findSeparator(String s, char... separators) {
        int[] result = {0, 0, s.length()};

        if(s.length() != 0) {
            result[1] += 1;
        }
        for(char c : s.toCharArray()) {
            if(c == 10) {
                result[0] += 1;
                result[1] += 1;
            } else if(c == 32) {
                result[1] += 1;
            }
        }
        return result;
    }
}
