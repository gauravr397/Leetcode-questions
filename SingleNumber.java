public class SingleNumber {
    // 136. Single Number
    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();
        int nums[] = { 4, 1, 2, 1, 2 };
        System.out.println(s.singlen(nums));
    }

    public int singlen(int[] nums) {
        int res = 0;
        for (int i : nums) {
            res ^= i;

        }
        return res;
    }
}
