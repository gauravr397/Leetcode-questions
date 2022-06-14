import java.util.Arrays;

public class RunningSumof1dArray {
    public static void main(String[] args) {
        RunningSumof1dArray r = new RunningSumof1dArray();
        int nums[] = { 3, 1, 2, 10, 1 };
        System.out.println(r.runningSum(nums));
    }

    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i] + sum;
            sum = ans[i];
        }
        return ans;

    }
}
