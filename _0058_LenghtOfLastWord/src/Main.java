public class Main {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Today is a nice day"));
    }


    public static int lengthOfLastWord(String s) {
        String[] lijst = s.split(" ");
        return lijst[lijst.length-1].length();
    }
}