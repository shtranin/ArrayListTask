/**
 * Интерфейс MyList
 */
public interface MyList<E> {
    boolean add(Object o);
    boolean set(int index, Object o);
    boolean remove(Object o);
    boolean remove(int index);
    boolean isEmpty();
    E get(int index);
    int size();
    void clear();
    boolean contains(Object o);
    void quickSort();
}
