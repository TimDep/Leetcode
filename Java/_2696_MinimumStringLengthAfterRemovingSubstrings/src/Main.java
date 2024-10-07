import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String s = "ABFCACDB";
        System.out.println(minLength(s));
    }

    public static int minLength(String s) {
        boolean done = true;
        while (done){
            if(s.contains("AB")){
                s = s.replaceAll("AB", "");
            }
            else if (s.contains("CD")){
                s=s.replaceAll("CD", "");
            }
            else{
                done = false;
            }
        }
        return s.length();
    }

    // faster, not mine
//    public static int minLength(String s) {
//        Stack<Character> st = new Stack();
//        for(int i=0; i<s.length(); i++){
//            if(!st.isEmpty() && ((s.charAt(i)=='B'&&st.peek()=='A') || (s.charAt(i)=='D'&&st.peek()=='C'))){
//                st.pop();
//            }
//            else st.push(s.charAt(i));
//        }
//        return st.size();
//    }
}