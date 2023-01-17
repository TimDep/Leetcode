public class Main {
    public static void main(String[] args) {
        int n=10;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        if (n==1 || n ==2 || n ==3) return n;
        if (n==4) return 5;
        int a=3;
        int b=5;
        int som=0;
        for (int i=5;i<=n; i++){
            som = a+b;
            a=b;
            b=som;
        }
        return som;
//        if (n==1 || n ==2 || n ==3) return n;
//        if (n==4) return 5;
//        return climbStairs(n-1)+climbStairs(n-2);
    }
}