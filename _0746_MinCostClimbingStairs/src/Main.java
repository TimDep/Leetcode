public class Main {
    public static void main(String[] args) {
        int[] cost = {0,1,2,2};  //werkt niet
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 1) return 0;
        if (cost.length == 2) {
            return Math.min(cost[0], cost[1]);
        }
        int kosten = 0;
        for (int i = 0; i < cost.length; i++) {
            if (i + 2 < cost.length && i + 1 < cost.length) {
                if (cost[i] + cost[i + 2] <= cost[i + 1]) {
                    kosten = kosten + cost[i] + cost[i + 2];
                    i = i + 2;
                } else {
                    kosten = kosten + cost[i + 1];
                    i = i + 1;
                }
            } else if (i + 1 < cost.length) {
                kosten+=Math.min(cost[i], cost[i+1]);
            }
        }
        return kosten;
    }

}