public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target =9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int helft = nums[nums.length/2];
        if (target<helft){
            for (int i =0; i<nums.length; i++){
                if (target==nums[i]){
                    return i;
                }
            }
        }
        else {
            for (int i =nums.length-1; i>=0; i--){
                if (target==nums[i]){
                    return i;
                }
            }
        }
        return -1;
    }
}