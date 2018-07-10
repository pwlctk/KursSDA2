package pl.pwlctk.day07_07.sorting;

import java.util.List;

class Quick {

    static List<Integer> sort(List<Integer> list) {
        return quickSort(list, 0, list.size() - 1);
    }

    private static List<Integer> quickSort(List<Integer> list, int lowIndex, int highIndex) {
        int low = lowIndex;
        int high = highIndex;
        int pivot = list.get((lowIndex + highIndex) / 2);
        while (low <= high) {
            while (list.get(low) < pivot) {
                low++;
            }
            while (list.get(high) > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = list.get(low);
                list.set(low, list.get(high));
                list.set(high, temp);
                low++;
                high--;
            }
        }
        if (lowIndex < high) {
            quickSort(list, lowIndex, high);
        }
        if (low < highIndex) {
            quickSort(list, low, highIndex);
        }
        return list;
    }
}
