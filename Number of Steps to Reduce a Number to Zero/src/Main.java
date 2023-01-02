public class Main {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int teller = 0;
        while (num!=0){
            if (num%2!=0){
                num-=1;
                teller+=1;
            }
            else{
                num=num/2;
                teller+=1;
            }
        }
        return teller;
    }
}