public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 4;
        FibonacciNumber f = new FibonacciNumber();
        System.out.println(f.fib(n));
    }

    public int fib(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else
            return fib(n - 1) + fib(n - 2);
    }
}
