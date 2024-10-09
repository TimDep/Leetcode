import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumer(nums));
    }

    public static int singleNumer(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]!=nums[i+1]){
                return nums[i];
            }
            i++;
        }
        return nums[nums.length-1];
    }
}