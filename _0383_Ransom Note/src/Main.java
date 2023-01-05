public class Main {
    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "abc";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] lijst1 = new int[26];
        int[] lijst2 = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            lijst1[ransomNote.charAt(i) - 97] += 1;
            lijst2[magazine.charAt(i) - 97] += 1;
        }
        if (magazine.length()>ransomNote.length()){
            for (int i=ransomNote.length(); i<magazine.length(); i++){
                lijst2[magazine.charAt(i)-97]+=1;
            }
        }
        for (int i =0; i<lijst1.length; i++){
            if (lijst1[i]!=0){
                if (lijst1[i]>lijst2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}