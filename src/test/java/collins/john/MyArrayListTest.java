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
    public void setUp(){
        testMyArrayList= new MyArrayList();
    }

    @Test
    public void isMyEmptyTest(){
        boolean actual = testMyArrayList.isMyEmpty();
        boolean expected = true;
        //boolean expected = false;//fail test
        assertEquals("should be true, new list is empty", expected, actual);
    }
    @Test
    public void myAddTest(){
        testMyArrayList.myAdd("testString");
        String actual = testMyArrayList.myGetAt(0).toString();
        String expected = "testString";
        //String expected = "fail";//fail test
        assertEquals("should say 'testString' at index 0", expected, actual);
    }
}
