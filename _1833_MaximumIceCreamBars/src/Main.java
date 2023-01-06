import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIceCream(costs, coins));
    }

    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int temp = 0;
        int aantal = 0;
        for (int i = 0; i < costs.length; i++) {
            if (temp+costs[i] <= coins) {
                    temp += costs[i];
                    aantal++;
            }
        }
        return aantal;
    }
}