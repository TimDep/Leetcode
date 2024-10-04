import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "(()(()()((()))";
        System.out.println(longestValidParentheses(s));
    }

    public static int longestValidParentheses(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return 0;
        }
        Stack<Character> stapel = new Stack<>();
        int teller = 0;
        int tweedeTeller=0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i+1 <s.length() && s.charAt(i) == '('&&s.charAt(i+1)==')') {
                teller+=2;
                i++;
            }else if (s.charAt(i) == '(') {
                stapel.push(')');
//                if (temp < teller) {
//                    temp = teller;
//                }
            }
            else if (!stapel.isEmpty() && stapel.pop() == s.charAt(i)) {
                tweedeTeller += 2;
            } else {
                stapel.push('/');
                if (temp < teller) {
                    temp = teller;
                }
                teller = 0;
            }
        }
        if (stapel.isEmpty()){
            return teller+temp;
        }
        if (temp < teller) {
            temp = teller;
        }
        if (temp == 0) {
            return teller;
        }
        return temp;
    }
}

//        if (s.length() == 0 || s.length() == 1) {
//            return 0;
//        }
//        Stack<Character> stapel = new Stack<>();
//        int teller = 0;
//        int tweedeTeller = 0;
//        int temp = 0;
//        int temptweede = 0;
//        boolean tweedeDeel = false;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '('&& stapel.isEmpty()) {
//                stapel.push(')');
//            }else if (s.charAt(i) == '('&& !stapel.isEmpty()) {
//                stapel.push(')');
//            }
//            else if (!tweedeDeel &&!stapel.isEmpty() && stapel.pop() == s.charAt(i)) {
//                tweedeTeller += 2;
//                if (tweedeTeller>temptweede){
//                    temptweede=tweedeTeller;
//                }
//            } else if (tweedeDeel &&!stapel.isEmpty() && stapel.pop() == s.charAt(i)) {
//                teller+=2;
//                if (teller>temp){
//                    temp=teller;
//                }
//            }
//            else if(!stapel.isEmpty()){
//                tweedeDeel=true;
//                tweedeTeller=0;
//            }
//        }
//        if (!stapel.isEmpty()){
//            if (temptweede>temp){
//                return temptweede;
//            }
//            return temp;
//        }
//        return temptweede+temp;
//    }