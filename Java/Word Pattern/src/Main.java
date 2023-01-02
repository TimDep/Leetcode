import java.util.*;

public class Main {
    public static void main(String[] args) {
        String pattern = "aaaa";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] woorden = s.split(" ");
        List<Character> letters = new ArrayList<>();
        List<String> dieren = new ArrayList<>();
        if (pattern.length()!=woorden.length){
            return false;
        }
        for (int i =0; i<pattern.length(); i++){
            if (dieren.contains(woorden[i])){
                if (pattern.charAt(i) != letters.get(dieren.indexOf(woorden[i]))){
                    return false;
                }
            } else if (letters.contains(pattern.charAt(i))) {
                if (!dieren.get(letters.indexOf(pattern.charAt(i))).equals(woorden[i])){
                    return false;
                }

            } else {
                letters.add(pattern.charAt(i));
                dieren.add(woorden[i]);
            }
        }
        return true;
    }
}