public class OOPSBannerApp {

    // UC7: Dedicated class for character patterns
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String getLine(int line) {
            return (line >= 0 && line < pattern.length) ? pattern[line] : "";
        }
    }

    public static void main(String[] args) {
        // Initializing character patterns using the new class structure
        CharacterPattern charO = new CharacterPattern('O', new String[]{
            "  *** ", " *   *", " *   *", " *   *", " *   *", " *   *", "  *** "
        });

        CharacterPattern charP = new CharacterPattern('P', new String[]{
            " **** ", " *  *", " *  *", " **** ", " * ", " * ", " * "
        });

        CharacterPattern charS = new CharacterPattern('S', new String[]{
            "  **** ", " * ", " * ", "  *** ", "        * ", "        * ", "    **** "
        });

        // Building the banner lines using the class getters
        String[] bannerLines = new String[7];
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join("  ", 
                charO.getLine(i), charO.getLine(i), charP.getLine(i), charS.getLine(i));
        }

        // Display the banner
        for (String row : bannerLines) {
            System.out.println(row);
        }
    }
}