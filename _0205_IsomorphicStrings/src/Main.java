import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s = "42";
        String t = "13";
        System.out.println(isIsomorphic(s,t));
    }

    public static boolean isIsomorphic(String s, String t) {
        //Slow and "much" memory
        List<Character> sLetters = new ArrayList<>();
        List<Character> tLetters = new ArrayList<>();
        for (int i =0; i<s.length(); i++){
            if (sLetters.contains(s.charAt(i)) && tLetters.contains(t.charAt(i))){
                int index = sLetters.indexOf(s.charAt(i));
                if (s.charAt(i) != sLetters.get(index) || t.charAt(i)!= tLetters.get(index)){
                    return false;
                }
            } else if (sLetters.contains(s.charAt(i)) || tLetters.contains(t.charAt(i))) {
                return false;
            } else {
                sLetters.add(s.charAt(i));
                tLetters.add(t.charAt(i));
            }
        }
        return true;
    }
    // Can be much quicker with hashmap
    //Also doable with my array solution but need to be much larger bc of ALL ascii characters
}