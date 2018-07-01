package pl.pwlctk.Day30_06.list;

public interface List<T> {
    void append(T element);
    void add(T element);
    T get(int index);
    void remove(int index);
    boolean isEmpty();
    int size();
}
