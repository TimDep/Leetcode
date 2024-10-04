import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] oplossing = new int[2];
        for (int i =0; i<nums.length; i++){
            for (int j=0;j<nums.length;j++){
                if (i !=j){
                    if (target == nums[i]+nums[j]){
                        oplossing[0] =i;
                        oplossing[1]=j;
                        return oplossing;
                    }
                }
            }
        }
        return oplossing;
    }
}