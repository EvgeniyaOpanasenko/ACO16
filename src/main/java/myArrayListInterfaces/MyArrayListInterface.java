package myArrayListInterfaces;

public interface MyArrayListInterface {
	
	public boolean add(Object o);
    public void add(int index, Object o);
    public Object get(int index);
    public Object remove(int index); // Returns: the element that was removed from the list
    public boolean remove(Object o);
    public Object set(int index, Object o); //= replace
    public void clear(); //Removes all of the elements from this list.
//The list will be empty after this call returns.
    public boolean contains(Object o);
   // public int size();


}