public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        MaxConsecutiveOnes m = new MaxConsecutiveOnes();
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        System.out.println(m.findMaxConsecutiveOnes(nums));
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (ans < count) {
                ans = count;
            }
        }
        return ans;
    }
}
