import java.util.Arrays;

public class TwoSumII {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        TwoSumII ts = new TwoSumII();
        System.out.println(Arrays.toString(ts.twosum(numbers, 9)));
    }

    public int[] twosum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (numbers[l] + numbers[r] != target) {
            if (numbers[l] + numbers[r] < target)
                l++;
            else
                r--;
        }
        return new int[] { l + 1, r + 1 };
    }
}
