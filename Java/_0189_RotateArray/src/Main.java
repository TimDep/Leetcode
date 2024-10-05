import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k = 2;
        rotate(nums, k);
    }

//    public static void rotate(int[] nums, int k) {
//        int[] array = new int[nums.length];
//        for (int i =0; i<nums.length; i++){
//            if (i+k> nums.length-1){
//                array[(k+i)%nums.length] = nums[i];
//            }
//            else{
//                array[k+i] = nums[i];
//            }
//        }
//        System.arraycopy(array, 0, nums, 0, nums.length);
//    }

    //smarter and faster way
    public static void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}