public class MinimumMovestoEqualArrayElements {
    public static void main(String[] args) {
        MinimumMovestoEqualArrayElements m = new MinimumMovestoEqualArrayElements();
        int nums[] = { 1, 2, 3 };
        System.out.println(m.minMoves(nums));
    }

    public int minMoves(int[] nums) {
        int moves = nums[0];
        int count = 0;
        for (int i : nums) {
            moves = Math.min(moves, i);

        }
        for (int i : nums) {
            count += Math.abs(moves - i);
        }
        return count;
    }
}
