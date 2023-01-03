public class Main {
    public static void main(String[] args) {
        int x =-121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String getal = Integer.toString(x);
        if(getal.startsWith("-")){
            return false;
        }
        StringBuilder getal2 = new StringBuilder();
        for (int i=getal.length()-1; i>=0; i--){
            getal2.append(getal.charAt(i));
        }
        String newgetal = getal2.toString();
        if (getal.equals(newgetal)){
            return true;
        }
        return false;
    }
}