package OOP.week6_day2;

/**
 * Created by Lisa on 11/13/2016.
 */
public interface Collection<E> extends Iterable {
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    <T> T[] toArray(T[] a);
    boolean add(E e);
    boolean remove(Object o);
    void clear();

}
