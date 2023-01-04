public class Main {
    public static void main(String[] args) {
        String s = "aaaaaa";
        String t = "bbaaaa";
        System.out.println(isSubsequence(s, t));
    }

    public static boolean isSubsequence(String s, String t) {
        if (t.length() < s.length()) {
            return false;
        }
        int teller = 0;
        int j;
        int temp=0;
        for (int i = 0; i < s.length(); i++) {
            for (j = temp; j < t.length(); ) {
                if (s.charAt(i) == t.charAt(j)) {
                    teller++;
                    temp=j+1;
                    break;
                } else {
                    j++;
                }
            }
        }
        return teller == s.length();
    }
//      Quicker & simpeler but not mine
//    int i = 0;
//    int j = 0;
//
//        while (i < s.length() && j < t.length()) {
//        if (s.charAt(i) == t.charAt(j)) {
//            i++;
//        }
//        j++;
//    }
//
//        return i == s.length();
//}
}