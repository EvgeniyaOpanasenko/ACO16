package OOP.week4_day1;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lisa on 10/29/2016.
 */
public class TestBinS {
    List list;
    @Before
    public void init (){
        list = new ArrayList();// Generic?
    }
    @Test
    public void TesrBinabarySearch(){
        BinabarySearch.binarySerach(list, new String());
    }
}
