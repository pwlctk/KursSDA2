package pl.pwlctk.day30_06.queue;

public class LinkedQueue<T> implements Queue<T> {
    private int queueSize;
    private QueueElement<T> first;
    private QueueElement<T> last;

    @Override
    public void push(T element) {
        QueueElement<T> newElement = new QueueElement<>(element);
        if (isEmpty()) {
            first = last = newElement;
        } else {
            last.nextElement = newElement;
            last = last.nextElement;
        }
        queueSize++;
    }

    @Override
    public T pop() {
        if (queueSize > 0) {
            queueSize--;
            T temp = first.value;
            first = first.nextElement;
            return temp;
        }
        return null;
    }

    @Override
    public T front() {
        if (queueSize > 0) {
            return first.value;
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return queueSize == 0;
    }

    @Override
    public int size() {
        return queueSize;
    }

    private class QueueElement<K> {
        private K value;
        private QueueElement<K> nextElement;

        QueueElement(K value) {
            this.value = value;
        }
    }
}
