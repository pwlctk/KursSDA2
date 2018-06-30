package pl.pwlctk.Day30_06.stack;

class LinkedStack<T> implements Stack<T>  {
    private int stackSize;
    private StackElement<T> top;

    public void push(T element) {
        stackSize++;
        top = new StackElement<>(element, top);
    }

    public T pop() {
        if (stackSize > 0) {
            stackSize--;
            T temp = top.value;
            top = top.previousElement;
            return temp;
        }
        return null;
    }

    public T peek() {
        if (stackSize > 0) {
            return top.value;
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return stackSize == 0;
    }

    public int size() {
        return stackSize;
    }

    private class StackElement<K> {
        private K value;
        private StackElement<K> previousElement;

        StackElement(K value, StackElement<K> previousElement) {
            this.value = value;
            this.previousElement = previousElement;
        }
    }
}
