import java.util.Arrays;

public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 3;
        KthLargestElementinanArray kth = new KthLargestElementinanArray();
        System.out.println(kth.findKthLargest(nums, k));
    }

    public int findKthLargest(int[] nums, int k) {

        // Brute force
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
