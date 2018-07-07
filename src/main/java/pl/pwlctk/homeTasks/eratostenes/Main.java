package pl.pwlctk.homeTasks.eratostenes;

import pl.pwlctk.SaveToDisk;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> primeNumbers = Eratostenes.primeNumbers(1000);
        System.out.print(primeNumbers.size() + ": ");
        System.out.println(primeNumbers);
        SaveToDisk.saveList(primeNumbers, "prime-numbers.txt");

    }
}

