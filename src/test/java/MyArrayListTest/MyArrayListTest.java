package MyArrayListTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import myArrayList.MyArrayList;

public class MyArrayListTest {

	private MyArrayList myList;
	
	@Before
	public void init(){
		myList = new MyArrayList (); 
		
	}
	
	
	@Test
	public void testMyArrayListadd(){
	
		boolean actual = myList.add("1");
		Assert.assertTrue(true);
		
	}


	
	@Test
	public void testMyArraySizeAfterAdd(){
	
		myList.add("1");
		Assert.assertEquals(1, myList.size());
		
	}
	
	@Test
	public void testAddMoreThan2(){
	
		myList.add("1");
		myList.add("2");
		myList.add("3");
		
		Assert.assertEquals(3, myList.size());
		Assert.assertEquals("1", myList.get(0));
		Assert.assertEquals("2", myList.get(1));
		Assert.assertEquals("3", myList.get(2));
		
		
	}
	
}
