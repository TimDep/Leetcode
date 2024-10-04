import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 7;
        int[][] edges = {{0, 1}, {0, 2}, {1, 4}, {1, 5}, {2, 3}, {2, 6}};
        List<Boolean> apples = Arrays.asList(false, false, true, false, true, true, false);
        System.out.println(minTime(n, edges, apples));
    }

    public static int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        int teller = 0;
        for (Boolean apple : hasApple) {
            if (!apple) {
                teller++;
            }
        }
        if (teller == hasApple.size()) {
            return 0;
        }
        return teller;

    }
}