/**
 * Реализация MyArrayList
 */
public class MyArrayList<E> implements MyList{
    private static final int INIT_CAPACITY = 16;
    private Object[] data;
    private int capacity;
    private int size;

    public MyArrayList() {
        data = new Object[INIT_CAPACITY];
        capacity = INIT_CAPACITY;
        size = 0;
    }
    public MyArrayList(int capacity) {
        data = new Object[capacity];
        this.capacity = capacity;
        size = 0;
    }

    /**
     * Добавление элемента в список
     */
    @Override
    public boolean add(Object o) {
        if(size >= capacity){
            increaseCapacity();
        }
        data[size++] = o;
        return true;
    }


    /**
     * Добавление элемента по конкретному индексу
     */
    @Override
    public boolean set(int index, Object o) {
        if(index < 0){
            return false;
        }else{
            data[index] = o;
            return true;
        }
    }


    /**
     * Удаление элемента из списка
     */
    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if(data[i].equals(o)){
                remove(i);
                return true;
            }
        }
        return false;
    }


    /**
     * Удаление элемента по индексу из списка
     */
    @Override
    public boolean remove(int index) {
        if(index < 0){
            return false;
        }else{
            for (int i = index; i < size; i++) {
                data[i] = data[i+1];
            }
            data[size-1] = null;
            size--;
            return true;
        }
    }


    /**
     * Проверка, является ли список пустым
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Получение элемента по индексу
     */
    @Override
    public Object get(int index) {
        if ((index < size) && (index >= 0)) {
            return (E) data[index];
        }
        return null;
    }


    /**
     * Получение длины списка
     */
    @Override
    public int size() {
        return size;
    }


    /**
     * Очистка списка от всех имеющихся элементов
     */
    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;

    }


    /**
     * Проверка, содержит ли список переданный в параметр элемент
     */
    @Override
    public boolean contains(Object o) {
            for (int i = 0; i < size; i++) {
                if (o.equals(data[i])) {
                    return true;
                }
            }
            return false;
        }


    private void increaseCapacity(){
    capacity = capacity * 2;
    Object[] newArray = new Object[capacity];
        if (size >= 0){
            System.arraycopy(data, 0, newArray, 0, size);
        }
    data = newArray;
    }


    /**
     * Быстрая сортировка
     */
    @Override
    public void quickSort() {

    }
}
