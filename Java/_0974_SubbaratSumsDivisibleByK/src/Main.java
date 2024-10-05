public class Main {
    public static void main(String[] args) {
        int[] nums = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(subarraysDivByK(nums,k));
    }
    //Time limit exceeded
    public static int subarraysDivByK(int[] nums, int k) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            int number =0;
            for (int j = i; j < nums.length; j++) {
                if (j == i){
                    number += nums[j];
                }
                else {
                    number += nums[j];
                }
                if (number % k == 0) {
                    counter++;
                }
            }

        }
        return counter;
    }
}