import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[counter-1]<nums[i]) {
                nums[counter] = nums[i];
                counter++;
            }
        }
        return counter;
    }

    //other solution
//    public static int removeDuplicates(int[] nums) {
//        Set<Integer> set = new LinkedHashSet<>();
//        for (int num : nums) {
//            set.add(num);
//        }
//        int counter = 0;
//        for (int value : set) {
//            nums[counter] = value;
//            counter++;
//        }
//        return set.size();
//    }
}