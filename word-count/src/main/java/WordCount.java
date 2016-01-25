import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {
    private static final String WORD_PATTERN = "\\w+";
    private static final Pattern PATTERN = Pattern.compile(WORD_PATTERN);

    public Map<String, Integer> phrase(String s) {
        Map<String, Integer> phrases = new HashMap<String, Integer>();
        Matcher matcher = PATTERN.matcher(s.toLowerCase());
        while (matcher.find()) {
            String word = matcher.group();
            phrases.put(word, phrases.getOrDefault(word, 0) + 1);
        }
        return phrases;
    }
}
