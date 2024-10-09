import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

//    public static int[] twoSum(int[] nums, int target) {
//        int[] oplossing = new int[2];
//        for (int i =0; i<nums.length; i++){
//            for (int j=0;j<nums.length;j++){
//                if (i !=j){
//                    if (target == nums[i]+nums[j]){
//                        oplossing[0] =i;
//                        oplossing[1]=j;
//                        return oplossing;
//                    }
//                }
//            }
//        }
//        return oplossing;
//    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        if (nums.length == 2){
            res[1] = 1;
            return res;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        for (int num : nums) {
            if (map.containsKey(target - num)) {
                if ((map.get(target-num) == map.get(num)&& map.get(num).size()>=2)){
                    res[0] = map.get(num).get(0);
                    res[1] = map.get(num).get(1);
                }else if (map.get(target-num) != map.get(num)){
                    res[0] = map.get(num).get(0);
                    res[1] = map.get(target-num).get(0);
                    break;
                }
            }
        }
        return res;
    }
}