import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int[][] points = {{3,9},{7,12},{3,8},{6,8},{9,10},{2,9},{0,9},{3,9},{0,6},{2,8}};
        System.out.println(findMinArrowShots(points));
    }

    public static int findMinArrowShots(int[][] points) {
//          WAY faster and smarter but not mine, sorts only on the last integer bc the arrow is one x-coordinate.
//        When the second value is higher then the arrow then a new arrow need to be shot etc
//        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
//
//        int arrow = 1;
//        int reach = points[0][1];
//
//        for (int i = 1; i < points.length; i++) {
//            if (points[i][0] > reach) {
//                arrow++;
//                reach = points[i][1];
//            }
//        }
//
//        return arrow;
//    }

        if (points.length == 1) {
            return 1;
        }
        Arrays.sort(points, (m, n) -> m[0] == n[0] ? m[1] - n[1] : m[0] - n[0]);
        boolean[] alGebruikt = new boolean[points.length];
        int onder;
        int boven;
        int oplossing = 0;
        for (int i = 0; i < points.length; i++) {
            onder = points[i][0];
            boven = points[i][1];
            if (!alGebruikt[i]) {
                for (int j = 0; j < points.length; j++) {
                    if (i != j && !alGebruikt[j]) {
                        if (points[j][0] >= onder && points[j][0] <= boven) {
                            onder = points[j][0];
                            alGebruikt[j] = true;
                        }
                        if (points[j][1] <= boven && points[j][1] >= onder) {
                            boven = points[j][1];
                            alGebruikt[j] = true;
                        }
                    }
                }
                oplossing++;
            }
            alGebruikt[i] = true;
        }
        return oplossing;
    }
}