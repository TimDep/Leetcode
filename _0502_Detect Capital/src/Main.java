public class Main {
    public static void main(String[] args) {
        String word = "UsA";
        System.out.println(detectCapitalUse(word));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        boolean lager = true;
        if (Character.isUpperCase(word.charAt(0))) {
            if (Character.isUpperCase(word.charAt(1))) {
                lager = false;
                if (restVanString(word.substring(2), lager)) {
                    return true;
                }

            } else {
                return restVanString(word.substring(2), lager);
            }
        }

        return restVanString(word, lager);
    }

    public static boolean restVanString(String word, boolean lager) {
        if (lager) {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }
}