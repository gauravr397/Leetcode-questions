public class MaxConsecutiveOnesIII {
    public static void main(String[] args) {
        MaxConsecutiveOnesIII m = new MaxConsecutiveOnesIII();
        int nums[] = { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 };
        int k = 2;
        System.out.println(m.longestOnes(nums, k));
    }

    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        int n = nums.length;
        int ans = Integer.MIN_VALUE;
        int zerocount = 0;
        while (j < n) {
            if (nums[j] == 0) {
                zerocount++;
            }
            while (zerocount > k) {
                if (nums[i] == 0) {
                    zerocount--;
                }
                i++;
            }

            ans = Math.max(ans, j - i + 1);
            j++;
        }
        return ans;
    }
}
