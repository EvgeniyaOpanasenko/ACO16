package OOP.week6_day2;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Lisa on 11/13/2016.
 */
public abstract class TestBinarySerach {

    private Collection<String> collection;

    @Before
    public abstract void setUp();
    
    @Test
    public void TestSizeWhenEpty() {
        assertEquals(0, collection.size());
    }

    @Test
    public void testIsEmpty() {
        //assertTrue(Collection.isEpty());
    }

    @Test
    public void testIsEmptyAfterA() {
        //assertTrue(Collection.isEpty());
    }

    @Test
    public void fewAdd() {
        assertTrue(collection.add("1"));
        assertTrue(collection.add("2"));
        assertEquals(2, collection.size());
    }

    @Test
    public void testFirstAdd(){
        assertTrue(collection.add("1"));
        assertEquals(1, collection.size());

    }

    @Test
    public void containsWhenTrue(){
        assertTrue(collection.add("1"));
        assertTrue(collection.add("2"));
        assertTrue(collection.add("3"));
        assertEquals(3, collection.size());

    }


}
