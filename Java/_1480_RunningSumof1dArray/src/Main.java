import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums) {
        if (nums.length==1){
            return nums;
        }
        int[] oplossing = new int[nums.length];
        oplossing[0]=nums[0];
        for (int i =1; i<nums.length;i++){
            oplossing[i]=oplossing[i-1]+nums[i];
        }
        return oplossing;
    }
}