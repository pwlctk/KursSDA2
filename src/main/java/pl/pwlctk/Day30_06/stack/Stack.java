package pl.pwlctk.Day30_06.stack;

public interface Stack<T> {
    void push(T element);
    T pop();
    T peek();
    boolean isEmpty();
    int size();
}
