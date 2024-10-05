public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int totalProfit = 0;
        int profit =0;
        int counter = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i+1; j < prices.length; j++) {
                if (prices[i] > prices[j]) {
                    i =j;
                }
                if (prices[i] < prices[j]) {
                    profit += ( prices[j]-prices[i]);
                    i =j;
                }
            }
            if (totalProfit < profit){
                totalProfit = profit;
            }
            counter++;
            i = counter-1;
            profit = 0;
        }
        return totalProfit;
    }
// not mine but faster
//    public int maxProfit(int[] prices) {
//        int maxProfit = 0;
//        for (int i = 0; i < prices.length-1; i++) {
//            if (prices[i+1] > prices[i]) {
//                maxProfit += prices[i+1] - prices[i];
//            }
//        }
//        return maxProfit;
//    }
}