import java.util.*;

public class FindMeOut {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = -1;
        int n = sc.nextInt();
        for (int i = n + 1; i < 1000; i++) {
            if (getsum(i) == n && i % n == 0) {
                res = i;
                break;
            }
        }
        System.out.println(res);
    }

    static int getsum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
