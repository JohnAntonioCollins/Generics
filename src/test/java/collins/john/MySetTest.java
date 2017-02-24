package collins.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by johncollins on 2/22/17.
 */
public class MySetTest
{
    MySet<String> testSet;

    @Before
    public void setUp()
    {
        testSet = new MySet<>();

    }

    @Test
    public void myAddToSetTest()
    {
        testSet.myAdd("one");
        testSet.myAdd("two");
        testSet.myAdd("one");
        int actual = testSet.getMySize();
        //int actual = -1;//fail test
        int expected = 2;
        assertEquals("should be 2, no dup's allowed", expected, actual);
    }

    @Test
    public void isMyEmptyTest()
    {
        boolean actual = testSet.isMyEmpty();
        boolean expected = true;
        //boolean expected = false;//fail test
        assertEquals("should be true, new list is empty", expected, actual);
    }

    @Test
    public void myAddTest()
    {
        testSet.myAdd("testString");
        String actual = testSet.myGetAt(0).toString();
        String expected = "testString";
        //String expected = "fail";//fail test
        assertEquals("should say 'testString' at index 0", expected, actual);
    }

    @Test
    public void myContainsTest()
    {
        String s = "testString";
        testSet.myAdd(s);
        boolean actual = testSet.myContains("testString");
        boolean expected = true;
        assertEquals("should be true, s was added", expected, actual);
    }

    @Test
    public void getMySizeTest()
    {
        String s = "testString";
        testSet.myAdd(s);
        int actual = testSet.getMySize();
        int expected = 1;
        assertEquals("should return 1, has only 1 thing", expected, actual);
    }

    @Test
    public void myClearTest()
    {
        testSet.myAdd("one");
        testSet.myAdd("two");
        testSet.myClear();
        int actual = testSet.getMySize();
        int expected = 0;
        assertEquals("should be 0, empty myArrayList", expected, actual);
    }

    @Test
    public void myRemoveTest()
    {
        testSet.myAdd("x");
        testSet.myAdd("xx");
        testSet.myAdd("xxx");
        testSet.myRemove(1);
        String actual = testSet.myGetAt(1);
        String expected = "xxx";
        assertEquals("should say 'xxx' in index 1 after 'xx' is removed", expected, actual);
    }

}
