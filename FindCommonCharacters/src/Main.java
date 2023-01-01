import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] words = {"bella","label","roller"};
        System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        List<String> letters = new ArrayList<>();
        StringBuilder[] woorden = new StringBuilder[words.length];
        for (int i =0; i< words.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(words[i]);
            woorden[i] = sb;
        }
        for (int i = 0; i < woorden[0].length();i++) {
            int teller = 0;
            for (int j = 1; j < woorden.length; j++) {
                for (int k = 0; k < woorden[j].length(); k++) {
                    if (woorden[0].charAt(i) == woorden[j].charAt(k) ) {
                        teller++;
                        woorden[j].replace(k,k+1,"");
                        if (teller != words.length-1){
                            break;
                        }
                    }
                    if (teller == words.length-1){
                        letters.add(String.valueOf(words[0].charAt(i)));
                        break;
                    }
                }
            }
        }
        return letters;
    }
}