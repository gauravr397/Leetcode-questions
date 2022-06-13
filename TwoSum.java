import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = { 2, 7, 11, 15 };
        int target = 9;
        TwoSum ts = new TwoSum();
        System.out.println(ts.twoSum(nums, target));

    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int reqk = target - nums[i];
            if (map.containsKey(reqk)) {
                return new int[] { map.get(reqk), i };

            } else {
                map.put(nums[i], i);
            }
        }
        return null;
    }
}
