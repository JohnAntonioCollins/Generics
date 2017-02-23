package collins.john;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by johncollins on 2/22/17.
 */
public class MyArrayListTest
{
    MyArrayList testMyArrayList;

    @Before
    public void setUp()
    {
        testMyArrayList = new MyArrayList();
    }

    @Test
    public void isMyEmptyTest()
    {
        boolean actual = testMyArrayList.isMyEmpty();
        boolean expected = true;
        //boolean expected = false;//fail test
        assertEquals("should be true, new list is empty", expected, actual);
    }

    @Test
    public void myAddTest()
    { //also myGetAtTest
        testMyArrayList.myAdd("testString");
        String actual = testMyArrayList.myGetAt(0).toString();
        String expected = "testString";
        //String expected = "fail";//fail test
        assertEquals("should say 'testString' at index 0", expected, actual);
    }

    @Test
    public void myAddOVERRIDEtest()
    {
        testMyArrayList.myAdd("testString");
        testMyArrayList.myAdd("nextString", 3);
        int actual = testMyArrayList.getMySize();
        int expected = 2;
        //String expected = "fail";//fail test
        assertEquals("should say 'testString' at index 0", expected, actual);
    }

    @Test
    public void myContainsTest()
    {
        String s = "testString";
        testMyArrayList.myAdd(s);
        boolean actual = testMyArrayList.myContains("testString");
        boolean expected = true;
        assertEquals("should be true, s was added", expected, actual);
    }

    @Test
    public void getMySizeTest()
    {
        String s = "testString";
        testMyArrayList.myAdd(s);
        int actual = testMyArrayList.getMySize();
        int expected = 1;
        assertEquals("should return 1, has only 1 thing", expected, actual);
    }

    @Test
    public void myClearTest()
    {
        testMyArrayList.myAdd("one");
        testMyArrayList.myAdd("two");
        testMyArrayList.myClear();
        int actual = testMyArrayList.getMySize();
        int expected = 0;
        assertEquals("should be 0, empty myArrayList", expected, actual);
    }

    @Test
    public void myRemoveTest()//TODO make tests to check values at indexes also
    {
        for (int i = 0; i < 10; i++)
        {
            testMyArrayList.myAdd(i * 5);
        }
        testMyArrayList.myRemove(2);
        int actual = testMyArrayList.getMySize();
        int expected = 9;
        assertEquals("should be size 9, removed 1 from 10", expected, actual);
    }
}
