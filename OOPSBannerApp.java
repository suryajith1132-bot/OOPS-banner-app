import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - UC8: HashMap & Centralized Rendering
 * Final iteration using Map for pattern lookup and StringBuilder for rendering.
 * @author Pranav
 * @version 8.0
 */
public class OOPSBannerApp {

    // Centralized Pattern Registry using Map
    private static final Map<Character, String[]> patternMap = new HashMap<>();

    static {
        // Populating the Map with character-to-pattern mappings
        patternMap.put('O', new String[]{"  *** ", " *   *", " *   *", " *   *", " *   *", " *   *", "  *** "});
        patternMap.put('P', new String[]{" **** ", " *   *", " *   *", " **** ", " * ", " * ", " * "});
        patternMap.put('S', new String[]{"  **** ", " * ", " * ", "  *** ", "        * ", "        * ", "    **** "});
    }

    public static void main(String[] args) {
        String word = "OOPS";
        renderBanner(word);
    }

    /**
     * Renders the banner horizontally using nested loops and StringBuilder
     */
    public static void renderBanner(String word) {
        int height = 7; // Standard ASCII height for our patterns

        for (int i = 0; i < height; i++) {
            StringBuilder lineResult = new StringBuilder();
            
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.get(c);
                if (pattern != null) {
                    lineResult.append(pattern[i]).append("  "); // Add spacing between letters
                }
            }
            System.out.println(lineResult.toString());
        }
    }
}