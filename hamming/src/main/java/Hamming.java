public class Hamming {
    public static int compute(String a, String a1) {
        if (a.length() != a1.length()) {
            throw new IllegalArgumentException();
        }
        int hammingDistance = 0;
        char[] firstSequence = a.toCharArray();
        char[] secondSequence = a1.toCharArray();
        for (int i = 0; i < firstSequence.length; i++) {
            if (firstSequence[i] != secondSequence[i]) {
                hammingDistance++;
            }
        }
        return hammingDistance;
    }
}
