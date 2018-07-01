package pl.pwlctk.day30_06.queue;

public interface Queue<T> {
    void push(T element);
    T pop();
    T front();
    boolean isEmpty();
    int size();
}
