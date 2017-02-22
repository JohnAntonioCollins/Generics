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

    public <T> myArrayList()
    {
        //does it need a constructor?
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
        mySize++;

    }

    public T myGetAt(int i)
    {
        return holder[i];
    }

    public void mySetAt(T t, int i)
    {
        holder[i] = t;
    }

    public void myClear()
    {
        temp = empty;
    }

}
