package myArrayList;


import java.util.Arrays;

import myArrayListInterfaces.MyArrayListInterface;

public class MyArrayList implements MyArrayListInterface {
	//The array buffer into which the elements of the ArrayList are stored. 
	//The capacity of the ArrayList is the length of this array buffer.
	private transient Object[] elementData;
	//The size of the ArrayList (the number of elements it contains).
	private int size;
	private int defaultCapasity = 10;
	
	public MyArrayList(){
		elementData = new Object [defaultCapasity];
	}
	
	public MyArrayList(int capasity){
		if (capasity < 0)
			throw new IllegalArgumentException("Capasity must be > 0 " + capasity);
		this.elementData = new Object[capasity];
	}
	
	// increasing number of chains
	private void increaseCapacity(int minCapacity){
		int oldCapacity = elementData.length;
		if (oldCapacity < minCapacity){
			Object [] oldData = elementData;
			int newCapacity = (oldCapacity*3)/2+1;
			if (newCapacity < minCapacity)
				newCapacity = minCapacity;
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
		}
		
	private void ifIndexOutOfRange(int index){
		if (index > size || index < 0) 
			throw new IndexOutOfBoundsException("Out of range" + index);
	}
	
	@Override
	public boolean add(Object o) {
		//increaseCapacity(size++); // modCount++
		elementData [size++] = o;
		return true;
	}
	
	@Override
	public void add(int index, Object o) {
		ifIndexOutOfRange(index);
		increaseCapacity (size++);
		//Copies an array from the specified source array, 
		//beginning at the specified position,
		//to the specified position of the destination array.
		//arg4 =>  This is the number of array elements to be copied.
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData [index] = o;
		size++;
			
	}
	
	@Override
	public Object get(int index) {
		ifIndexOutOfRange(index);
		return elementData[index];
	}
	
	@Override
	public Object remove(int index) {
		ifIndexOutOfRange(index);
		//still need to work out
		System.arraycopy(elementData, index, elementData, index, size - index -1);
		for (int i =0; i < elementData.length; i ++){
			if( i == index)
				elementData[i] = null;
		}
		return null;
	}
	
	public int size() {
		return size;
		
	}
	
	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Object set(int index, Object o) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void clear() {
		for (int i = 0; i < elementData.length; i++)
			elementData [i] = null;
			size = 0;
	}
	
	@Override
	public boolean contains(Object o) {
		for (int i= 0; i < elementData.length; i++){
			if (o.equals(elementData[i]));
		}	
		return true;
	}

	
	
	
}