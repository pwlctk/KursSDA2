package pl.pwlctk.day07_07.search;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

class BinarySearch {
    static Optional<Integer> search(List<Integer> list, int key) {

        Collections.sort(list); //sortowanie na wszelki wypadek
        return binarySearch(list, 0, list.size() - 1, key);
    }

    private static Optional<Integer> binarySearch(List<Integer> list, int start, int end, int key) {
        int pivot = (start + end) / 2;
        if (key == list.get(pivot)) {
            return Optional.of(pivot);
        } else if (key < list.get(pivot) && start < pivot) {
            return binarySearch(list, start, pivot, key);
        } else if (key > list.get(pivot) && pivot < end) {
            return binarySearch(list, pivot + 1, end, key);
        }
        return Optional.empty();
    }
}
