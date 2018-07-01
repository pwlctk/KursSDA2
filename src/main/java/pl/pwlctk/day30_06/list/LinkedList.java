package pl.pwlctk.day30_06.list;

public class LinkedList<T> implements List<T> {
    private ListElement<T> first;
    private ListElement<T> last;
    private int size;

    @Override
    public void add(T element) {
        ListElement<T> newElement = new ListElement<>(element);

        if (isEmpty()) {
            first = last = newElement;
        } else {
            last.nextElement = newElement;
            last.nextElement.previousElement = last;
            last = last.nextElement;
        }
        size++;
    }

    @Override
    public void add(int index, T element) {
        if (index >= 0 && index <= size) {
            ListElement<T> newElement = new ListElement<>(element);
            ListElement<T> underIndexElement = getElement(index);

            //Dodawanie do pustej listy
            if (first == null) {
                first = last = newElement;

                //Dodawanie ostatniego elementu
            } else if (underIndexElement == null) {
                last.nextElement = newElement;
                last.nextElement.previousElement = last;
                last = last.nextElement;

                //Dodawanie, na początek listy (indeks = 0)
            } else if (underIndexElement.previousElement == null) {
                underIndexElement = first;
                first = newElement;
                first.nextElement = underIndexElement;
                underIndexElement.previousElement = first;

                //Dodawanie do środka listy
            } else {
                underIndexElement.previousElement.nextElement = newElement;
                newElement.previousElement = underIndexElement.previousElement;
                newElement.nextElement = underIndexElement;
                underIndexElement.previousElement = newElement;
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
            ListElement<T> currentElement = first;
            for (int i = 0; i < index; i++) {
                currentElement = currentElement.nextElement;
            }
            if (currentElement == null) {
                throw new IndexOutOfBoundsException("Index: " + index);
            }
            return currentElement;
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
                ListElement<T> secondElement = first.nextElement;
                secondElement.previousElement = null;
                first = secondElement;
                return elementToRemove.value;
            }

            //Usuwanie ostatniego elementu
            else if (elementToRemove.nextElement == null) {
                ListElement<T> penultimateElement = last.previousElement;
                penultimateElement.nextElement = null;
                last = penultimateElement;
                return elementToRemove.value;
            }

            //Usuwanie środkowego elementu
            else {
                ListElement<T> previousElement = elementToRemove.previousElement;
                ListElement<T> nextElement = elementToRemove.nextElement;
                previousElement.nextElement = elementToRemove.nextElement;
                nextElement.previousElement = previousElement;
                return elementToRemove.value;
            }

        } else {
            throw new IndexOutOfBoundsException("Index: " + index);
        }
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public List<T> reversed() {
        List<T> reversedList = new LinkedList<>();
        ListElement<T> currentElement = last;
        while (currentElement != null) {
            reversedList.add(currentElement.value);
            currentElement = currentElement.previousElement;
        }
        return reversedList;
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
