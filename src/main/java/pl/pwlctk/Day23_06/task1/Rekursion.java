package pl.pwlctk.Day23_06.task1;

class Rekursion {

    static long computeFactorial(long n) {
        if (n < 0) {
            return -1;
        } else {
            if (n < 2) {
                return 1;
            } else {
                return n * computeFactorial(n - 1);
            }
        }
    }

    static long computeFibonacci(long n) {
        if (n < 1) {
            return 0;
        } else if (n < 3) {
            return 1;
        } else
            return computeFibonacci(n - 1) + computeFibonacci(n - 2);
    }
}

