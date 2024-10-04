public class Main {
    public static void main(String[] args) {
        String s = "00011000";
        System.out.println(minFlipsMonoIncr(s));
    }

    public static int minFlipsMonoIncr(String s) {
        int teller1 =0;
        int index = 0;
        if (s.charAt(0)=='1'){
            index=1;
            teller1++;
        }
        for (int i =1; i<s.length(); i++){
            if (s.charAt(i)=='1'){
                if (index==0){
                    index=i;
                }
                teller1++;
            }
        }
        int teller0=0;
        for (int i =index; i<s.length(); i++){
            if (s.charAt(i)=='0'){
                teller0++;
            }
        }
        if (teller1>teller0){
            return teller0;
        }
        return teller1;
    }
}