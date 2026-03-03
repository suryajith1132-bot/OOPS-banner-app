public class OOPSBannerApp {

// Helper method for letter 'O'
    public static String getLineO(int line) {
        String[] pattern = {
            "  ***  ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            " *   * ",
            "  ***  "
        };
        return pattern[line];
    }

    // Helper method for letter 'P'
    public static String getLineP(int line) {
        String[] pattern = {
            " ****  ",
            " *   * ",
            " *   * ",
            " ****  ",
            " *     ",
            " *     ",
            " *     "
        };
        return pattern[line];
    }

    // Helper method for letter 'S'
    public static String getLineS(int line) {
        String[] pattern = {
            " **** ",
            " *    ",
            " *    ",
            " **** ",
            "    * ",
            "    * ",
            " **** "
        };
        return pattern[line];
    }

    public static void main(String[] args) {

        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("   ",
                    getLineO(i),
                    getLineO(i),
                    getLineP(i),
                    getLineS(i));
        }

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}

