public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 4;
        FibonacciNumber f = new FibonacciNumber();
        System.out.println(f.fib(n));
    }

    public int fib(int n) {
        // if (n <= 0) {
        // return 0;
        // } else if (n == 1) {
        // return 1;
        // } else
        // return fib(n - 1) + fib(n - 2);

        // optimal
        int ans = 0;
        int fibo[] = new int[n + 1];
        fibo[0] = 0;
        fibo[1] = 1;
        for (int i = 2; i <= n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
            ans = fibo[i];
        }
        return ans;
    }
}
