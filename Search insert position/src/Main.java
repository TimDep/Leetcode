public class Main {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] >= target) {
                return 0;
            }
            return 1;
        }

        if (nums[nums.length-1] < target) {
            return nums.length;
        } else if (nums[0] >= target) {
            return 0;
        }else if (nums.length == 2) {
            return 1;
        }
        int boven = nums.length;
        int onder = 0;
        while (onder <= boven) {
            int plaats = (boven + onder) / 2;
            if (nums[plaats] == target) {
                return plaats;
            } else if (nums[plaats] > target) {
                boven = plaats - 1;
            } else if (nums[plaats] < target) {
                onder = plaats + 1;
            }
        }
        return onder;
    }
}