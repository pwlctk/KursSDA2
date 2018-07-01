package pl.pwlctk.Day30_06.list;


public class LinkedList<T> implements List<T> {
    private ListElement<T> currentElement;
    private int size;

    @Override
    public void append(T element) {
        currentElement = new ListElement<>(element, 0, null, currentElement);
        size++;
    }

    @Override
    public void add(T element) {
        currentElement = new ListElement<>(element, size, currentElement, null);
        size++;
    }

    @Override
    public T get(int index) {
            return currentElement.element;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }


    private class ListElement<K> {
        private K element;
        private ListElement<K> previousElement;
        private ListElement<K> nextElement;
        private int index;

        ListElement(K element, int index, ListElement<K> previousElement, ListElement<K> nextElement) {
            this.element = element;
            this.previousElement = previousElement;
            this.nextElement = nextElement;
        }
    }
}
