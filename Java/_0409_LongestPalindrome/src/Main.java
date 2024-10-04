public class Main {
    public static void main(String[] args) {
        String s = "zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s){
        if(s.length()==1) return 1;
        int[] array = new int[58];
        for (int i =0; i<s.length(); i++){
            array[s.charAt(i)-65] +=1;
        }
        int aantal=0;
        boolean enkel = false;
        for (int i =0; i<array.length; i++){
            if (array[i]==1 && !enkel){
                aantal++;
                enkel=true;
            }
            if (array[i]!=0){
                if (array[i]%2==0){
                    aantal+=array[i];
                }else if (!enkel && array[i]%2==1){
                    aantal+=array[i];
                    enkel=true;
                }
                else{
                    aantal+=array[i]-1;
                }
            }
        }
        return aantal;
    }

}