package pl.pwlctk.day01_07.heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private List<Integer> tree;


    public Heap() {
        this.tree = new ArrayList<>();
    }

    public void add(int value) {
        tree.add(value);
        swiftUp(tree.size() - 1);
    }

    //nie działa to dobrze!
    public int remove() {
        if (tree.size() == 0) {
            throw new IndexOutOfBoundsException();
        } else if (tree.size() == 1) {
            int lastElement = tree.get(0);
            tree.remove(0);
            return lastElement;
        } else {
            int elementToRemove = tree.get(0);
            int currentIndex = 0;
            int greaterChildIndex = getLargestChildIndex(0);
            int lastIndex = tree.size() - 1;
            int lastValue = tree.get(lastIndex);
            while (greaterChildIndex < lastIndex) {
                if (tree.get(greaterChildIndex) < lastValue) {
                    tree.set(currentIndex, tree.get(greaterChildIndex));
                }
                currentIndex = greaterChildIndex;
                greaterChildIndex = getLargestChildIndex(currentIndex);
            }
            tree.remove(lastIndex);
            tree.set(currentIndex, lastValue);

            return elementToRemove;
        }
    }

    private void swiftUp(int nodeIndex) {
        if (nodeIndex > 0) {
            int parentIndex = getParentIndex(nodeIndex);
            if (getParent(nodeIndex) > tree.get(nodeIndex)) {
                int tmp = getParent(nodeIndex);
                tree.set(parentIndex, tree.get(nodeIndex));
                tree.set(nodeIndex, tmp);
                swiftUp(parentIndex);
            }
        }
    }


    private int getLargestChildIndex(int index) {
        if (isRightChild(index)) {
            return getLeftChild(index) > getRightChild(index) ? getLeftChildIndex(index) : getRightChildIndex(index);
        } else if (isLeftChild(index)) {
            return getLeftChild(index);
        } else {
            return tree.size();
        }
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

    private int getParent(int index) {
        if (index != 0) {
            return tree.get((index - 1) / 2);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private int getParentIndex(int index) {
        if (index != 0) {
            return (index - 1) / 2;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isLeaf(int index) {

        return !isLeftChild(index);
    }

    private boolean isLeftChild(int index) {

        return (2 * index + 1) < tree.size();
    }

    private boolean isRightChild(int index) {
        return (2 * index + 2) < tree.size();
    }

    private int getLeftChild(int index) {
        return tree.get(getLeftChildIndex(index));
    }

    private int getRightChild(int index) {
        return tree.get(getRightChildIndex(index));
    }

    @Override
    public String toString() {
        return tree.toString();
    }
}
