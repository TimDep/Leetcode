public class Main {
    public static void main(String[] args) {
        String[] strs = {"rrjk","furt","guzm"};
        System.out.println(minDeletionSize(strs));
    }

    public static int minDeletionSize(String[] strs) {
        int teller=0;
        for (int i =0; i<strs[0].length(); i++){
            for (int j=0; j< strs.length-1; j++){
                if (strs[j].charAt(i)>strs[j+1].charAt(i)){
                    teller+=1;
                    break;
                }

            }
        }
        return teller;
    }
}