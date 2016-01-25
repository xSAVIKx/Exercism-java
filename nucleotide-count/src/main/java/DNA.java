import java.util.*;

public class DNA {
    private final static List<Character> DNA_ELEMENTS = Arrays.asList('A', 'C', 'G', 'T');
    private final String dna;
    private final Map<Character, Integer> nucleotideCounts;

    public DNA(String dna) {
        this.dna = dna.toUpperCase();
        nucleotideCounts = new HashMap<Character, Integer>();
        initNucleotideCounts();
    }

    private void initNucleotideCounts() {
        for (Character c : DNA_ELEMENTS) {
            nucleotideCounts.put(c, 0);
        }
        for (char c : dna.toCharArray()) {
            if (nucleotideCounts.containsKey(c)) {
                nucleotideCounts.put(c, nucleotideCounts.get(c) + 1);
            }
        }
    }

    public int count(Character dnaElement) {
        if (!nucleotideCounts.containsKey(dnaElement)) {
            throw new IllegalArgumentException("No such DNA element " + dnaElement + " can be found.");
        }
        return nucleotideCounts.get(dnaElement);
    }

    public Map<Character, Integer> nucleotideCounts() {
        return Collections.unmodifiableMap(nucleotideCounts);
    }
}
