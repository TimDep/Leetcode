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
        int[] oplossing = new int[nums1.length+nums2.length];
        for (int i =0; i<nums1.length; i++) {
            oplossing[i]=nums1[i];
        }
        for (int j =0; j< nums2.length; j++){
            oplossing[j+nums1.length]=nums2[j];
        }
        Arrays.sort(oplossing);
        double eerste;
        double tweede;
        if (oplossing.length % 2 != 0) {
            return oplossing[oplossing.length/ 2];
        }
        eerste = oplossing[oplossing.length/ 2 -1];
        tweede = oplossing[oplossing.length/ 2];
        return (eerste + tweede) / 2;
    }
}