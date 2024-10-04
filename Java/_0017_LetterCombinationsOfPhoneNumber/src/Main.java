import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String digits = "237";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        List<String> oplossing = new ArrayList<>();
        Map<Integer, String> letters = new HashMap<>();
        letters.put(2, "abc");
        letters.put(3, "def");
        letters.put(4, "ghi");
        letters.put(5, "jkl");
        letters.put(6, "mno");
        letters.put(7, "pqrs");
        letters.put(8, "tuv");
        letters.put(9, "wxyz");
        if (digits.length() == 0) {
            return oplossing;
        }
        if (digits.length() == 1) {
            String hulp = letters.get(Integer.parseInt(digits));
            for (int i = 0; i < hulp.length(); i++) {
                oplossing.add(Character.toString(hulp.charAt(i)));
            }
            return oplossing;
        }
        List<String> alleletters = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < digits.length(); i++) {
            alleletters.add(letters.get(Integer.parseInt(Character.toString(digits.charAt(i)))));
        }
        List<String> tussenopl1 = new ArrayList<>();
        for (int i = 0; i < alleletters.get(0).length(); i++) {
            sb.append(alleletters.get(0).charAt(i));
            for (int j = 0; j < alleletters.get(1).length(); j++) {
                sb.append(alleletters.get(1).charAt(j));
                tussenopl1.add(sb.toString());
                sb.delete(sb.length() - 1, sb.length());
            }
            sb.delete(sb.length() - 1, sb.length());
        }
        if (digits.length() == 2) {
            return tussenopl1;
        }
        String hulp;
        hulp = letters.get(Integer.parseInt(Character.toString(digits.charAt(2))));
        List<String> tussenopl2 = new ArrayList<>();
        for (String s : tussenopl1) {
            for (int j = 0; j < hulp.length(); j++) {
                String hulp2 = s + hulp.charAt(j);
                tussenopl2.add(hulp2);
            }
        }
        if (digits.length() == 3) {
            return tussenopl2;
        }
        hulp = letters.get(Integer.parseInt(Character.toString(digits.charAt(3))));
        List<String> tussenopl3 = new ArrayList<>();
        for (String s : tussenopl2) {
            for (int j = 0; j < hulp.length(); j++) {
                String hulp2 = s + hulp.charAt(j);
                tussenopl3.add(hulp2);
            }
        }
        return tussenopl3;
    }
}