package OOP.TestDemoVideo;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Lisa on 11/4/2016.
 */
public class TestCalc {
    static Calc c;

    @Before
    public void inic() {
        c = new Calc();
    }

    @Test
    public void testAdd() {
        Calc c = new Calc();
        assertEquals(6, c.add(2, 4));
    }

    @Test
    public void testDiv() {

        try {
            assertEquals(3, c.div(6, 2));
        } catch (Exception e) {
            System.out.println("ha ha");
        }

    }

    @Test(expected = Exception.class)
    public void testDivZero() {
        //Calc c = new Calc();
        assertEquals(3, c.div(6, 0));


    }
}
