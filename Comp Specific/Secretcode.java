
/*Question :
    You need To Generate a secret code.
    Input:
    You are given a , you will have to change the digits of the number to
    generate secret code .
    If digit is positive , then increase by 1.
    If digit is negative , then decrease by 1.
    sample input:
    45671
    Output
    54760
*/
import java.util.*;

public class Secretcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        long p = 1;

        while (n > 0) {
            long r = n % 10;
            r = r % 2 == 0 ? r + 1 : r - 1;
            ans += r * p;
            p *= 10;
            n /= 10;
        }
        System.out.println(ans);
    }
}
