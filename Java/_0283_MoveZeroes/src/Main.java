import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 0,1,0,3,12};
        moveZeroes(nums);
    }

//    public void moveZeroes(int[] nums) {
//        if (nums.length > 1){
//            for (int i = 0; i < nums.length - 1; i++) {
//                if (nums[i] == 0){
//                    for (int j = i+1; j < nums.length; j++) {
//                        if (nums[j] != 0){
//                            int temp = nums[i];
//                            nums[i] = nums[j];
//                            nums[j] = temp;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//    }

    public static void moveZeroes(int[] nums) {
        int j =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0 && nums[j]==0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(nums[j]!=0){
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}