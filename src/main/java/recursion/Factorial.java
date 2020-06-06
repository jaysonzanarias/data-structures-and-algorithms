package recursion;

public class Factorial {
    public static int factorial(int n) {
        if (0 == n) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
