import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int value :nums){
            if(map.containsKey(value)) {
                return true;
            }
            else{
                map.put(value,true);
            }
        }
        return false;
    }

//    public static boolean containsDuplicate(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        for (int num : nums){
//            set.add(num);
//        }
//        return set.size() != nums.length;
//    }
}