public class Bob {
    private static final String ELSE = "Whatever.";
    private static final String NO_TEXT = "Fine. Be that way!";
    private static final String YELL = "Whoa, chill out!";
    private static final String QUESTION = "Sure.";

    public String hey(String phrase) {
        if (isBlank(phrase)) {
            return NO_TEXT;
        }
        if (isYell(phrase)) {
            return YELL;
        }
        if (isQuestion(phrase)) {
            return QUESTION;
        }
        return ELSE;
    }

    private static boolean isYell(String s) {
        boolean containLetters = false;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                containLetters = true;
                if (Character.isLowerCase(c)) {
                    return false;
                }
            }
        }
        return containLetters;
    }

    private static boolean isQuestion(String s) {
        return s.endsWith("?");
    }

    private static boolean isBlank(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        for (char c : s.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                return false;
            }
        }
        return true;
    }
}
