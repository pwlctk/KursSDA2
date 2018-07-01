package pl.pwlctk.Day30_06.list;


public class LinkedList<T> implements List<T> {
    private ListElement<T> first;
    private ListElement<T> last;
    private int size;

    LinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    @Override
    public void add(T element) {
        ListElement<T> listElement = new ListElement<>(element);

        if (isEmpty()) {
            first = last = listElement;
        } else {
            last.nextElement = listElement;
            last.nextElement.previousElement = last;
            last = last.nextElement;
        }
        size++;
    }

    @Override
    public void add(int index, T element) {
        if (index >= 0 && index <= size) {
            ListElement<T> newElement = new ListElement<>(element);
            ListElement<T> tempElement = getElement(index);

            //Dodawanie do pustej listy
            if (first == null) {
                first = last = newElement;

                //Dodawanie ostatniego elementu
            } else if (tempElement == null) {
                last.nextElement = newElement;
                last.nextElement.previousElement = last;
                last = last.nextElement;

                //Dodawanie, na początek listy (indeks = 0)
            } else if (tempElement.previousElement == null) {
                tempElement = first;
                first = newElement;
                first.nextElement = tempElement;
                tempElement.previousElement = first;

                //Dodawanie do środka listy
            } else {
                ListElement<T> previous = tempElement.previousElement;
                previous.nextElement = newElement;
                newElement.previousElement = previous;
                newElement.nextElement = tempElement;
                tempElement.previousElement = newElement;
            }
            size++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Index: " + index);
        }
    }

    @Override
    public T get(int index) {
        return getElement(index).value;
    }

    private ListElement<T> getElement(int index) {
        if (index < size) {
            ListElement<T> tempElement = first;
            for (int i = 0; i < index; i++) {
                tempElement = tempElement.nextElement;
            }
            if (tempElement == null) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            return tempElement;
        } else {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    @Override
    public T remove(int index) {
        if (index < size && index >= 0) {
            size--;
            ListElement<T> elementToRemove = getElement(index);
            //Usuwanie pierwszego elementu
            if (elementToRemove.previousElement == null) {
                first.nextElement.previousElement = null;
                first = first.nextElement;
                return elementToRemove.value;
            }

            //Usuwanie ostatniego elementu
            else if (elementToRemove.nextElement == null) {
                last.previousElement.nextElement = null;
                last = last.previousElement;
                return elementToRemove.value;
            }

            //Usuwanie środkowego elementu
            else {
                elementToRemove.previousElement.nextElement = elementToRemove.nextElement;
                elementToRemove.nextElement.previousElement = elementToRemove.previousElement;
                return elementToRemove.value;
            }

        } else {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder listContent = new StringBuilder();
        for (int i = 0; i < size; i++) {
            listContent.append(i).append(": ").append(get(i)).append("\n");
        }
        return listContent.toString();
    }

    private class ListElement<K> {
        private K value;
        private ListElement<K> previousElement;
        private ListElement<K> nextElement;

        ListElement(K element) {
            this.value = element;
        }
    }
}
