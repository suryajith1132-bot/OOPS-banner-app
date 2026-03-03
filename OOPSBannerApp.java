public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", " ", "WELCOME", " ", "*"),
                String.join("", "*", " ", "TO", " ", "*"),
                String.join("", "*", " ", "UC5 BANNER", " ", "*"),
                String.join("", "*", " ", " ", " ", " ", " ", " ", " ", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}