public class Main {
    public static void main(String[] args) {
        System.out.println(strStr("abc","c"));
    }

    public static int strStr(String haystack, String needle){
        if (!haystack.contains(needle) || needle.length()>haystack.length()){
            return -1;
        }
        if (haystack.equals(needle)){
            return 0;
        }
        int index=Integer.MAX_VALUE;
        for (int i =0; i<=(haystack.length()-needle.length()); i++){
            if (haystack.substring(i,i+needle.length()).contains(needle)){
                if (i<index){
                    index=i;
                }
            }
        }
        return index;
    }
}