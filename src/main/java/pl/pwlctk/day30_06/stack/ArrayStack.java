package pl.pwlctk.day30_06.stack;

import java.util.ArrayList;
import java.util.List;

class ArrayStack<T> implements Stack<T>{
    private List<T> list;
    private final int maxSize;
    private int stackSize;
    private T top;

    ArrayStack(int maxSize) {
        list = new ArrayList<>();
        stackSize = 0;
        this.maxSize = maxSize;
    }

    @Override
    public void push(T element) {
        if (size() < maxSize) {
            list.add(element);
            stackSize++;
            top = element;
        } else {
            System.out.println("Stos jest pełny!");
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            T temp;
            stackSize--;
            temp = list.get(stackSize);
            if (stackSize > 0) {
                top = list.get(stackSize - 1);
            }
            list.remove(stackSize);
            return temp;
        }
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            return top;
        }
    }

    @Override
    public boolean isEmpty() {
        return stackSize == 0;
    }

    @Override
    public int size() {
        return stackSize;
    }
}
