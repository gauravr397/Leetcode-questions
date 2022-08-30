
import java.util.*;

public class OneFourNineDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int count = 0;
        System.out.println(countnum(m, n, count));
    }

    static int countnum(int m, int n, int count) {
        if (m > n) {
            return -1;
        }

        for (int i = m; i <= n; i++) {
            int t = i;
            int rem = t % 10;
            if (rem == 1 || rem == 4 || rem == 9) {
                t /= 10;
                int rem1 = t % 10;
                if (rem1 == 1 || rem1 == 4 || rem1 == 9) {
                    t /= 10;
                    int rem2 = t % 10;
                    if (rem == 1 || rem == 4 || rem == 9) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
