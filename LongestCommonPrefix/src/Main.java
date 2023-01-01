import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int temp = 999999;
        for (String str : strs) {
            if (temp > str.length()) {
                temp = str.length();
            }
        }
        Character letter;
        boolean magNog = true;
        for (int i = 0; i < temp; i++) {
            if (magNog) {
                letter = strs[0].charAt(i);
                int teller = 0;
                for (int j = 1; j < strs.length; j++) {
                    if (letter == strs[j].charAt(i)) {
                        teller++;
                    }
                }
                if (teller == strs.length - 1) {
                    sb.append(letter);
                } else {
                    magNog = false;
                }
            }

        }
        if (sb.isEmpty()) {
            return "";
        }
        return sb.toString();
    }
}