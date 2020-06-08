package algorithm.recursion;

public class TailRecursion {
    public static int factorial(int n, int result) {
        if(0==n) {
            return result;
        }

        return factorial(n-1, n*result);
    }

    public static int factorial(int n) {
        return factorial(n, 1);
    }
}
