package pl.pwlctk.Day30_06.queue;

public class LinkedQueue<T> implements Queue<T> {
    private int queueSize;
    private QueueElement<T> first;
    private QueueElement<T> last;


    public LinkedQueue() {
        this.queueSize = 0;
        this.first = null;
        this.last = null;
    }

    @Override
    public void push(T element) {
        if (isEmpty()) {
            last = new QueueElement<>(element);
            first = last;
        } else {
            last.nextElement = new QueueElement<>(element);
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
            this.nextElement = null;
        }
    }
}
