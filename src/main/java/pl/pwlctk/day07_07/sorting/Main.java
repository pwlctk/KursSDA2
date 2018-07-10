package pl.pwlctk.day07_07.sorting;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(60);
        list.add(5);
        list.add(45);
        list.add(10);
        list.add(50);
        list.add(40);
        list.add(15);
        list.add(20);

        System.out.println("Nieposortowana lista: " + list);
        System.out.println("Quick: " + Quick.sort(list));
        System.out.println("Merge: " + Merge.sort(list));
    }
}
