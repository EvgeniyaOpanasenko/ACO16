package OOP.week5_day2.MyList;import org.junit.Before;import org.junit.Test;/** * Created by Lisa on 11/6/2016. */public class ListTest {    MyList myList;    @Before    public void init(){        myList = new MyList();    }    @Test(expected = IndexOutOfBoundsException.class )    public void toGetWhenWrongInex(){        myList.get(myList.size());    }}