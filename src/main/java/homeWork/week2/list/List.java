package homeWork.week2.list;

/**
 * Created by Lisa on 11/17/2016.
 */
public interface List {
    boolean add(Object o);
    boolean add(int index, Object o);
    boolean clear();
    boolean contains(Object o);
    Object get(int index);
    int indexOf(Object o);
    boolean isEmpty();
    int lastIndexOf(Object o);
    boolean remove(int index);
    boolean remove(Object o);
    boolean set(int index, Object o);
    int size();
    String toArray();
}
