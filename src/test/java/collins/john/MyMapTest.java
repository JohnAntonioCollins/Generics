package collins.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by johncollins on 2/22/17.
 */
public class MyMapTest
{
    MyMap testMap;

    @Before
    public void setUp()
    {
        testMap = new MyMap();
    }

    @Test
    public void myPutTest()
    {
        testMap.myPut("knock", "answer");
        String actual = testMap.myGet("knock").toString();
        //String expected = "fake";
        String expected = "answer";
        assertEquals("should say 'answer'", expected, actual);
    }
    @Test
    public void myClearTest(){//also mySize Test
        for (int i = 0; i < 10; i++)
        {
            testMap.myPut(i, i*34);
        }
        testMap.myClear();
        int expected = 0;
        int actual = testMap.mySize();
        assertEquals("should return 0, set's been cleared", expected, actual);
    }
    @Test
    public void myIsEmptyTest(){
        boolean actual = testMap.myIsEmpty();
        boolean expected = true;
        assertEquals("should be true, empty map", expected, actual);
    }
}
