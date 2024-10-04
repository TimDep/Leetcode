public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = 0;
        int minimum = prices[0];
        for (int i = 0; i < prices.length; i++) {
            minimum = Math.min(minimum, prices[i]);
            max = Math.max(max, prices[i] - minimum);
        }
        return max;
    }


//    Still time exceeded
//
//        int i =0;
//        int j=i+1;
//        int profit=0;
//        while (i< prices.length && j< prices.length){
//            if (prices[j]-prices[i]>profit){
//                profit = prices[j]-prices[i];
//            }
//            if (j== prices.length-1){
//                i++;
//                j=i+1;
//            }else {
//                j++;
//            }
//        }
//        return profit;
//    }
//        Too slow, time limited exceeded O(n2)
//
//        if (prices.length==1) return 0;
//        int profit=0;
//        for (int i =0; i<prices.length; i++){
//            for (int j=i+1; j< prices.length; j++){
//                if (prices[j]-prices[i]>profit){
//                    profit = prices[j]-prices[i];
//                }
//            }
//        }
//        return profit;

}