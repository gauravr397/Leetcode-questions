import java.util.*;

public class MinSteps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int count = 0;
        System.out.println(solve(x, y, count));
    }

    public static int solve(int x, int y, int count) {

        if (x == 1 && y == 1) {
            return count;
        }
        if (x == y || x < 1 || y < 1) {
            return -1;
        }
        if (x > y) {
            count++;
            return solve(x - y, y, count);
        } else {
            count++;
            return solve(x, y - x, count);
        }

    }
}