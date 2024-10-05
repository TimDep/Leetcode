import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,4,2};
        int p = 7;
        System.out.println(minSubarray(nums,p));
    }

    public static int minSubarray(int[] nums, int p) {
        long number = 0;
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i =0; i<nums.length; i++){
            number += nums[i];
            arrayList.add((long) nums[i]);
        }
        if (number % p == 0){
            return 0;
        }
        else{
            long rest = number % p;
            if (arrayList.contains(rest)){
                return 1;
            }
            else if(number % p != 0 && number / p == 0){
                return -1;
            }
            else{
                //check for multiple numbers but as less as possible
                return 2;
            }
        }
    }
}