public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray r = new RemoveDuplicatesfromSortedArray();
        int nums[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(r.removeDuplicates(nums));
    }

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int l = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] == nums[i]) {

            }

            else {
                nums[l] = nums[i];
                l++;
            }

        }
        return l;
    }
}
