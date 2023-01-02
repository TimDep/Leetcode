import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2,4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> oplossing = new ArrayList<>();
        for (int i : nums1) {
            oplossing.add(i);
        }
        for (int j : nums2){
            oplossing.add(j);
        }
        Collections.sort(oplossing);
        double eerste;
        double tweede;
        if (oplossing.size() % 2 != 0) {
            return oplossing.get(oplossing.size() / 2);
        }
        eerste = oplossing.get(oplossing.size() / 2 - 1);
        tweede = oplossing.get(oplossing.size() / 2);
        return (eerste + tweede) / 2;
    }
}