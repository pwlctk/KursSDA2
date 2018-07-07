package pl.pwlctk.homeTasks.eratostenes;

import java.util.ArrayList;
import java.util.List;

class PrimeNumbersStandard {
    private List<Integer> prime = new ArrayList<>();

    private boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    List primeNumbers(int first, int last) {
        prime.clear();
        for (int i = first; i <= last; i++) {
            if (isPrimeNumber(i)) {
                prime.add(i);
            }
        }
        return prime;
    }

    List primeNumbers(int last) {
        prime.clear();
        int first = 2;
        for (int i = first; i <= last; i++) {
            if (isPrimeNumber(i)) {
                prime.add(i);
            }
        }
        return prime;
    }




    List<Integer> getPrimeNumbersList() {
        return prime;
    }
}
