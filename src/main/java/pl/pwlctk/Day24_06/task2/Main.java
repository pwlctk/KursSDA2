package pl.pwlctk.Day24_06.task2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        double amount = 795.98;

        List<Integer> billsList = Cash.bills(amount);
        List<Double> coinsList = Cash.coins(amount);

        System.out.println("Kwota do wydania: " + amount);
        System.out.printf("Banknoty (%d sztuk): %s", billsList.size(), billsList);
        System.out.println();
        System.out.printf("Monety (%d sztuk): %s", coinsList.size(), coinsList);
        System.out.println();

    }
}
