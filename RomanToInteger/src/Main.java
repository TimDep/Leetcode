import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        Map<String, Integer> roman = new HashMap<>();
        roman.put("I", 1);
        roman.put("V", 5);
        roman.put("X", 10);
        roman.put("L", 50);
        roman.put("C", 100);
        roman.put("D", 500);
        roman.put("M", 1000);
        roman.put("IV", 4);
        roman.put("IX", 9);
        roman.put("XL", 40);
        roman.put("XC", 90);
        roman.put("CD", 400);
        roman.put("CM", 900);
        int oplossing = 0;
        oplossing += roman.get(Character.toString(s.charAt(0)));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                String ss= (s.charAt(i - 1) + Character.toString(s.charAt(i)));
                if (roman.containsKey(ss)) {
                    oplossing -= roman.get(Character.toString(s.charAt(i - 1)));
                    oplossing += roman.get(ss);
                }
                else {
                    oplossing += roman.get(Character.toString(s.charAt(i)));
                }
            } else {
                oplossing += roman.get(Character.toString(s.charAt(i)));
            }

        }
        return oplossing;
    }
}