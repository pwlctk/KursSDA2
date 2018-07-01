package pl.pwlctk.day30_06.stack;

class LinkedStack<T> implements Stack<T>  {
    private int stackSize;
    private StackElement<T> top;

    @Override
    public void push(T element) {
        stackSize++;
        top = new StackElement<>(element, top);
    }

    @Override
    public T pop() {
        if (stackSize > 0) {
            stackSize--;
            T temp = top.value;
            top = top.previousElement;
            return temp;
        }
        return null;
    }

    @Override
    public T peek() {
        if (stackSize > 0) {
            return top.value;
        } else {
            return null;
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

    private class StackElement<K> {
        private K value;
        private StackElement<K> previousElement;

        StackElement(K value, StackElement<K> previousElement) {
            this.value = value;
            this.previousElement = previousElement;
        }
    }
}
