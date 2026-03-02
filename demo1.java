import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = initializePatterns();

        renderWord("OOPS", patternMap);
    }

    // Initialize Map with character patterns
    public static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        return map;
    }

    // Render word using stored patterns
    public static void renderWord(String word, Map<Character, String[]> map) {

        for (int row = 0; row < 7; row++) {
            for (char ch : word.toCharArray()) {
                System.out.print(map.get(ch)[row] + " ");
            }
            System.out.println();
        }
    }
}
