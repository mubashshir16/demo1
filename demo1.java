public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPattern o = new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        CharacterPattern p = new CharacterPattern('P', new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        });

        CharacterPattern s = new CharacterPattern('S', new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        });

        CharacterPattern[] word = {o, o, p, s};

        for (int row = 0; row < 7; row++) {
            for (CharacterPattern cp : word) {
                System.out.print(cp.getPattern()[row] + " ");
            }
            System.out.println();
        }
    }
}

/* CharacterPattern Class */
class CharacterPattern {

    private char character;
    private String[] pattern;

    public CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}
