package pl.pwlctk.day07_07.sorting;

import java.util.LinkedList;
import java.util.List;

class Merge {
    private static List<Integer> sortedList;
    private static List<Integer> tempList;

    static List<Integer> sort(List<Integer> list) {
        sortedList = list;
        tempList = new LinkedList<>(list);
        doMergeSort(0, list.size() - 1);
        return sortedList;
    }

    private static void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempList.set(i, sortedList.get(i));
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempList.get(i) <= tempList.get(j)) {
                sortedList.set(k, tempList.get(i));
                i++;
            } else {
                sortedList.set(k, tempList.get(j));
                j++;
            }
            k++;
        }
        while (i <= middle) {
            sortedList.set(k, tempList.get(i));
            k++;
            i++;
        }
    }
}
