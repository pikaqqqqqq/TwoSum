import java.util.HashMap;

/**
 * Created by think on 2017/12/29.
 */
public class test {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum3(nums, 9);
        //int[] result = twoSum1(nums, 9);
        for (int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }

    public static int[] twoSum3(int[] nums, int target) {
        if (nums == null) return null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i,map.get(target - nums[i])};
            }else {
                map.put(nums[i], i);
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        if (nums == null) return null;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{i,map.get(target - nums[i])};
            }
        }
        return null;
    }

    public static int[] twoSum1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (target == nums[i] + nums[j] && i != j) {
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
