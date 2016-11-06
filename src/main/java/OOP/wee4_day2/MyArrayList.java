package OOP.wee4_day2;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by Lisa on 10/30/2016.
 */
public class MyArrayList<T> implements MyList<T>{

    private T[] elementData = (T[])new Object[10];
    private int size;
    private int defaultCapasity = 10;

   public MyArrayList(){
        //elementData = new T[defaultCapasity];
    }

    @Override
    public boolean add(T o) {
        increaseCapacity(size++); // modCount++
        elementData [size++] = o;
        return true;
    }

    private void increaseCapacity(int minCapacity) {
        int oldCapacity = elementData.length;
        if (oldCapacity < minCapacity){
            Object [] oldData = elementData;
            int newCapacity = (oldCapacity*3)/2+1;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
    }

    @Override
    public boolean add(int index, T o) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public boolean contains(T o) {
        return false;
    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public int indexOf(T o) {
        return 0;
    }

    @Override
    public boolean isEmpty(T o) {
        return false;
    }

    @Override
    public int lastIndexOf(T o) {
        return 0;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public boolean remove(T o) {
        return false;
    }

    @Override
    public boolean set(int index, T o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator<T> iterator() {
        return new MyArryListIterator();
    }

    private class MyArryListIterator implements Iterator<T> {


        int currentPosition = 0;

        @Override
        public boolean hasNext() {
             return currentPosition < elementData.length;
        }

        @Override
        public T next() {
            return elementData[currentPosition++];
        }
    }

}
