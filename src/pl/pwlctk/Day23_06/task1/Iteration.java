package pl.pwlctk.Day23_06.task1;

public class Iteration {

    public static long computeFactorial(long n) {
        if (n < 0) {
            return -1;
        } else {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }

    public static long computeFibonacci(long n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else {
            int temp;
            int a = 0;
            int b = 1;
            for (int i = 1; i < n; i++) {
                temp = b;
                b = b + a;
                a = temp;
            }
            return b;
        }
    }
}

