class MaximumProductSubarray {
    public static void main(String[] args) {
        MaximumProductSubarray m = new MaximumProductSubarray();
        int nums[] = { 2, 3, -1, 4 };
        System.out.println(m.maxprod(nums));
    }

    public int maxprod(int[] nums) {
        int max = Integer.MIN_VALUE, p = 1;
        for (int i = 0; i < nums.length; i++) {
            p *= nums[i];
            max = Math.max(max, p);
            if (p == 0) {
                p = 1;
            }
        }
        p = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            p *= nums[i];
            max = Math.max(max, p);
            if (p == 0) {
                p = 1;
            }
        }
        return max;
    }
}