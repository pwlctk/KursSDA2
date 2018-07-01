package pl.pwlctk.day23_06.task1;

class Iteration {

    static long computeFactorial(long n) {
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

    static long computeFibonacci(long n) {
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

