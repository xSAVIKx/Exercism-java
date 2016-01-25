import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private final String word;
    private final char[] sortedAlphabet;

    public Anagram(String word) {
        this.word = word;
        sortedAlphabet = word.toLowerCase().toCharArray();
        Arrays.sort(sortedAlphabet);
    }

    public List<String> match(List<String> strings) {
        List<String> results = new ArrayList<String>();
        for (String s : strings) {
            if (sortedAlphabet.length == s.length() && !word.equalsIgnoreCase(s)) {
                char[] wordChars = s.toLowerCase().toCharArray();
                Arrays.sort(wordChars);
                if (Arrays.equals(sortedAlphabet, wordChars)) {
                    results.add(s);
                }
            }
        }
        return results;
    }
}
