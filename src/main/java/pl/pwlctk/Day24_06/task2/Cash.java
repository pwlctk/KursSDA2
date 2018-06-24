package pl.pwlctk.Day24_06.task2;

import java.util.LinkedList;
import java.util.List;

class Cash {
    static List<Integer> bills(double amount) {
        List<Integer> billList = new LinkedList<>();

        int twoHundredBill = 200;
        int oneHundredBill = 100;
        int fiftyBill = 50;
        int twentyBill = 20;
        int tenBill = 10;
        int fiveBill = 5;
        int oneBill = 1;

        int billsAmount = (int) amount;

        while (billsAmount != 0) {
            while (billsAmount >= twoHundredBill) {
                billList.add(twoHundredBill);
                billsAmount -= twoHundredBill;
            }

            if (billsAmount >= oneHundredBill) {
                billList.add(oneHundredBill);
                billsAmount -= oneHundredBill;
            }

            if (billsAmount >= fiftyBill) {
                billList.add(fiftyBill);
                billsAmount -= fiftyBill;
            }

            while (billsAmount >= twentyBill) {
                billList.add(twentyBill);
                billsAmount -= twentyBill;
            }

            if (billsAmount >= tenBill) {
                billList.add(tenBill);
                billsAmount -= tenBill;
            }

            if (billsAmount >= tenBill) {
                billList.add(tenBill);
                billsAmount -= tenBill;
            }

            if (billsAmount >= fiveBill) {
                billList.add(fiveBill);
                billsAmount -= fiveBill;
            }

            while (billsAmount >= 1) {
                billList.add(oneBill);
                billsAmount -= oneBill;
            }
        }
        return billList;
    }

    static List<Integer> coins(double amount) {
        List<Integer> coinList = new LinkedList<>();
        int fiftyCoin = 50;
        int twentyCoin = 20;
        int tenCoin = 10;
        int fiveCoin = 5;
        int oneCoin = 1;

        int billsAmount = (int) amount;
        double coinsAmountDouble = Math.round((amount - billsAmount) * 100) / 100.0;
        int coinsAmount = (int) (coinsAmountDouble * 100);

        while (coinsAmount != 0) {
            if (coinsAmount >= fiftyCoin) {
                coinList.add(50);
                coinsAmount -= fiftyCoin;
            }

            while (coinsAmount >= twentyCoin) {
                coinList.add(20);
                coinsAmount -= twentyCoin;
            }

            if (coinsAmount >= tenCoin) {
                coinList.add(10);
                coinsAmount -= tenCoin;
            }

            if (coinsAmount >= fiveCoin) {
                coinList.add(5);
                coinsAmount -= fiveCoin;
            }

            while (coinsAmount >= 1) {
                coinList.add(1);
                coinsAmount -= oneCoin;
            }
        }
        return coinList;
    }
}
