package collins.john;

import java.util.Arrays;

/**
 * Created by johncollins on 2/22/17.
 */
public class myArrayList<T>
{
    private T[] empty;
    private T[] temp;
    private T[] holder;
    private int mySize = 0;
    private boolean myEmpty;

    public <T> myArrayList()
    {
        myEmpty = true;
    }

    public int getMySize()
    {
        return mySize;
    }

    public void add(T t)
    {
        //copy holder, increase size, add new T at end, copy back to holder. mySize++
        temp = Arrays.copyOf(holder, holder.length / 2 + holder.length);
        temp[mySize] = t;
        holder = Arrays.copyOf(temp, temp.length);
        temp = empty;
        mySize++;

    }

    public T myGetAt(int i)
    {
        return holder[i];
    }

    public void mySetAt(T t, int i)
    {
        if (i > mySize)
        {
            i = mySize;
        }
        holder[i] = t;
    }

    public void myClear()
    {
        holder = empty;
        mySize = 0;
    }

    public boolean myIsEmpty()
    {
        myEmpty = mySize == 0 ? true : false;
        return myEmpty;
    }

}
