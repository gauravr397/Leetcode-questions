public class MinimumMovestoEqualArrayElementsII {
    public static void main(String[] args) {
        MinimumMovestoEqualArrayElementsII m = new MinimumMovestoEqualArrayElementsII();
        int nums[] = { 1, 10, 2, 9 };
        System.out.println(m.minMoves(nums));

    }

    public int minMoves(int[] nums) {
        int mid = nums[nums.length / 2], moves = 0;
        for (int i : nums) {
            moves += Math.abs(mid - i);
        }
        return moves;
    }
}
