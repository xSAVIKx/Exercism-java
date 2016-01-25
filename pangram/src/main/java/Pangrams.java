import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Pangrams {
    private static final List<Character> ALPHABET = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public static boolean isPangram(String s) {
        if (s == null || s.isEmpty())
            return false;
        String normalized = s.toLowerCase();
        for (char c : ALPHABET) {
            if (normalized.indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }
}
