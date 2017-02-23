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
        String actual = testMap.get("knock").toString();
        //String expected = "fake";
        String expected = "answer";
        assertEquals("should say 'answer'", expected, actual);
    }
}
