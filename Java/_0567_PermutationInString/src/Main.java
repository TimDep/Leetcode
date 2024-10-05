public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bbbca";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] countS1 = new int[26];
        int[] countS2 = new int[26];

        for (int i =0; i<s1.length(); i++) {
            countS1[s1.charAt(i) - 97]++;
            countS2[s2.charAt(i) - 97]++;
        }
        int counter = 0;
        for (int i = 0; i < 26; i++) {
            if (countS1[i] == countS2[i]){
                counter++;
            }
        }
        if (counter == countS2.length) return true;
        else counter = 0;
        for (int i = s1.length(); i < s2.length(); i++) {
            countS2[s2.charAt(i-s1.length()) - 97]--;
            countS2[s2.charAt(i) - 97]++;
            if (countS1 == countS2){
                return true;
            }
            for (int j = 0; j < 26; j++) {
                if (countS1[j] == countS2[j]){
                    counter++;
                }
            }
            if (counter == countS2.length) return true;
            else counter = 0;
        }
        return false;
    }

    //TLE
//    public static boolean checkInclusion(String s1, String s2) {
//        String sb1 = s1;
//        for (int i = 0; i < s2.length(); i++) {
//            if (s2.length() - i >= sb1.length()) {
//                if (s1.contains(Character.toString(s2.charAt(i)))) {
//                    String sb2 = s2.substring(i , i+s1.length());
//                    sb1 = sb1.replaceFirst(Character.toString(s2.charAt(i)), "");
//                    for (int j = 1; j < sb2.length(); j++) {
//                        if (sb1.contains(Character.toString(sb2.charAt(j)))) {
//                            sb1 = sb1.replaceFirst(Character.toString(sb2.charAt(j)), "");
//                        }
//                        else{
//                            sb1 = s1;
//                            break;
//                        }
//                    }
//                    if (sb1.isEmpty()) {
//                        return true;
//                    }
//                }else{
//                    sb1 = s1;
//                }
//            }
//        }
//        return false;
//    }
}