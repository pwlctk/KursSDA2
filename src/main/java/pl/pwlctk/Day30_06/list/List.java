package pl.pwlctk.Day30_06.list;

public interface List<T> {
    void add(T element);
    void add(int index, T element);
    T get(int index);
    T remove(int index);
    int size();
    boolean isEmpty();
    List<T> reversed();

}
