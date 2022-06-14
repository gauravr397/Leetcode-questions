public class FindPivotIndex {
    public static void main(String[] args) {

        FindPivotIndex f = new FindPivotIndex();
        int nums[] = { 1, 7, 3, 6, 5, 6 };
        System.out.println(f.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {

        int tot = 0;
        for (int i = 0; i < nums.length; i++) {
            tot += nums[i];

        }
        int r = 0, l = 0;
        for (int i = 0; i < nums.length; i++) {
            r = tot - l - nums[i];
            if (r == l)
                return i;
            l += nums[i];
        }
        return -1;
    }
}
