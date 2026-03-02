public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ", o[i], o[i], p[i], s[i]);
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Method for letter O
    public static String[] getO() {
        return new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };
    }

    // Method for letter P
    public static String[] getP() {
        return new String[]{
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };
    }

    // Method for letter S
    public static String[] getS() {
        return new String[]{
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };
    }
}
