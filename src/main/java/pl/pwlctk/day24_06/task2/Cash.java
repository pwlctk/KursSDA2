package pl.pwlctk.day24_06.task2;

import java.util.LinkedList;
import java.util.List;

class Cash {
    static List<Integer> bills(double amount) {
        List<Integer> billList = new LinkedList<>();

        int[] bills = {500, 200, 100, 50, 20, 10, 5, 1};
        int billsAmount = (int) amount;
        int i = 0;
        while (billsAmount > 0) {
            if (billsAmount >= bills[i]) {
                billsAmount -= bills[i];
                billList.add(bills[i]);
            } else {
                i++;
            }
        }
        return billList;
    }

    static List<Double> coins(double amount) {
        List<Double> coinListDouble = new LinkedList<>();
        int[] coins = {50, 20, 10, 5, 2, 1};
        int billsAmount = (int) amount;
        double coinsAmountDouble = Math.round((amount - billsAmount) * 100) / 100.0;
        int coinsAmount = (int) (coinsAmountDouble * 100);

        int i = 0;
        while (coinsAmount > 0) {
            if (coinsAmount >= coins[i]) {
                coinsAmount -= coins[i];
                coinListDouble.add(coins[i] / 100.0);
            } else {
                i++;
            }
        }
        return coinListDouble;
    }


}

