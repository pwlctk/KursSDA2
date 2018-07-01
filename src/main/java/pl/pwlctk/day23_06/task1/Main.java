package pl.pwlctk.day23_06.task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Podaj liczbę: ");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        System.out.println("Rekurencja:");
        System.out.println("Silnia z " + n + " wynosi: " + Rekursion.computeFactorial(n));
        System.out.println("Wyraz: " + n + " ciągu Fibonacciego wynosi: " + Rekursion.computeFibonacci(n));
        System.out.println();
        System.out.println("Iteracja: ");
        System.out.println("Silnia z " + n + " wynosi: " + Iteration.computeFactorial(n));
        System.out.println("Wyraz: " + n + " ciągu Fibonacciego wynosi: " + Iteration.computeFibonacci(n));
    }
}
