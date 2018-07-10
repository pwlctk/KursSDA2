package pl.pwlctk.day07_07.search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(40);
        list.add(5);
        list.add(25);
        list.add(80);
        list.add(45);
        list.add(60);
        list.add(55);
        list.add(30);

        int searchItem = 25;
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Szukamy: " + searchItem);
        System.out.println("Szukany element znajduje się na indeksie: " + BinarySearch.search(list, searchItem));

    }
}
