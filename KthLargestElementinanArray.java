import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargestElementinanArray {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 3;
        KthLargestElementinanArray kth = new KthLargestElementinanArray();
        System.out.println(kth.findKthLargest(nums, k));
    }

    public int findKthLargest(int[] nums, int k) {

        // Brute force o(nlogn)
        // Arrays.sort(nums);
        // return nums[nums.length - k];

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            pq.add(nums[i]);
        }
        for (int i = k; i < nums.length; I++) {
            if (pq.peek() < nums[i]) {
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
