public class SingleNumber {
    // 136. Single Number
    /*
     * nums = 4,1,2,1,2
     * first XOR will convert the numbers to there bit representation and then
     * compare those bit with XOR operation
     * res = 0 xor 4 -> 000 ^ 100 = 100 which is bit value of 4
     * res = 4 ^ 1 -> 100 ^ 001 = 101 which is bit value of 5
     * res = 5 ^ 2 -> 101 ^ 010 = 111 which bit value of 7
     * res - 7 ^ 1 -> 111 ^ 001 = 110 which is bit value of 6
     * res - 6 ^ 2 -> 110 ^ 010 = 100 which is bit value of 4
     * and we successfully return non repeating value
     */
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
