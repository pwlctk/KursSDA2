package pl.pwlctk.day01_07.completeBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class CompleteBinaryTree<T> {
    private List<T> tree;

    CompleteBinaryTree() {
        this.tree = new ArrayList<>();
    }

    void add(T value) {
        tree.add(value);
    }

    private int getLeftChildIndex(int index) {
        if (isLeftChild(index)) {
            return 2 * index + 1;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private int getRightChildIndex(int index) {
        if (isLeftChild(index)) {
            return 2 * index + 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    int getParent(int index) {
        if (index != 0) {
            return (index - 1) / 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    boolean isLeaf(int index) {
        return isLeftChild(index);
    }

    private boolean isLeftChild(int index) {
        return (2 * index + 2) < tree.size();
    }

    T getLeftChild(int index) {
        return tree.get(getLeftChildIndex(index));
    }

    T getRightChild(int index) {
        return tree.get(getRightChildIndex(index));
    }

    @Override
    public String toString() {
        return tree.toString();
    }
}
