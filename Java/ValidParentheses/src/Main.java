import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String s = "(){}}{";
        System.out.println(isValid(s));

    }

    public static boolean isValid(String s) {
        char[] haakjes = new char[s.length()];
        if (s.length() % 2 > 0) {
            return false;
        }
        int[] tellen = new int[6];
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(' -> tellen[0] += 1;
                case ')' -> tellen[1] += 1;
                case '{' -> tellen[2] += 1;
                case '}' -> tellen[3] += 1;
                case '[' -> tellen[4] += 1;
                case ']' -> tellen[5] += 1;
            }
        }
        for (int i=0; i<tellen.length;i+=2){
            if (tellen[i]!=tellen[i+1]){
                return false;
            }
        }
        int teller = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(':
                    haakjes[teller] = '(';
                    teller++;
                    break;
                case ')':
                    teller--;
                    if (teller<0||haakjes[teller]!='(') {
                        return false;
                    } else {
                        haakjes[teller] = 0;
                        break;
                    }
                case '{':
                    haakjes[teller] = '{';
                    teller++;
                    break;
                case '}':
                    teller--;
                    if (teller<0||'{' != haakjes[teller]) {
                        return false;
                    } else {
                        haakjes[teller] = 0;
                        break;
                    }
                case '[':
                    haakjes[teller] = '[';
                    teller++;
                    break;
                case ']':
                    teller--;
                    if (teller<0||'['!= haakjes[teller]) {
                        return false;
                    } else {
                        haakjes[teller] = 0;
                        break;
                    }
            }
        }
        for (int i = 0; i < haakjes.length; i++) {
            if (haakjes[i] != 0 && haakjes[i] != 999) {
                return false;
            }
        }
        return true;
    }
}