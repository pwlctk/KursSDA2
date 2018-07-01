package pl.pwlctk.day23_06.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Podaj liczbę: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        NumericalSeq.showSequences(n);
    }
}
