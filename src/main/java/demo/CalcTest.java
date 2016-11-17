package demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Lisa on 11/12/2016.
 */
public class CalcTest {
       Calc c;
    @Before
    public void init(){
        c = new Calc(1,2);
    }

@Test
public void sumTest(){
    Assert.assertEquals(3, Calc.sum(1,2));
}

@Test
    public void divTest(){
    Assert.assertEquals(6, Calc.div(12,2));
}

@Test
    public void divZeroTest(){

}
}
