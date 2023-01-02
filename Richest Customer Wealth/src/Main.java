public class Main {
    public static void main(String[] args) {
        int [][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {
        int meest=0;
        for (int i=0; i< accounts.length;i++){
            int temp = 0;
            for (int j=0; j<accounts[0].length;j++){
                temp+=accounts[i][j];
            }
            if (temp>meest){
                meest=temp;
            }
        }
        return meest;
    }
}