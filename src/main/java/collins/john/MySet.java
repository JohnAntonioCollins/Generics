package collins.john;

import java.util.Arrays;

/**
 * Created by johncollins on 2/22/17.
 */
public class MySet<T>
{

    private T t;
    private Object[] empty;
    private Object[] temp;
    private Object[] holder;
    private int mySize;
    private boolean myEmpty;
    boolean contains;

    public MySet()
    {
        holder = new Object[10];
        myEmpty = true;
        mySize = 0;
    }

    public int getMySize()
    {
        return mySize;
    }

    public void myAdd(T t)
    {
        this.doesContain(t);
        if(!contains)
        {
            //copy holder, increase size, add new T at end, copy back to holder. mySize++
            temp = Arrays.copyOf(holder, holder.length + 10);
            temp[mySize] = t;
            holder = Arrays.copyOf(temp, temp.length);
            temp = empty;
            mySize++;
            Arrays.sort(holder);
        }

    }
    public void myRemove(int index)
    {
        int start = index;
        for (int i = start; i < mySize; i++)
        {
            holder[index] = holder[index + 1];
            index++;
        }
        mySize--;
        holder = Arrays.copyOf(holder, mySize);
        Arrays.sort(holder);
    }

    public Object myGetAt(int i)
    {
        return holder[i];
    }


    public void myClear()
    {
        holder = empty;
        mySize = 0;
    }

    public boolean isMyEmpty()
    {
        myEmpty = mySize == 0 ? true : false;
        return myEmpty;
    }

    private void doesContain(T t)
    {
        contains = false;
        //if any T in holder .equals t, return true
        for (Object i : holder
                )
        {
            if (t.equals(i))
            {
                contains = true;
            }
        }

    }

    public boolean myContains(T t)
    {
        this.doesContain(t);
        return contains;
        /*
        boolean contains = false;
        //if any T in holder .equals t, return true
        for (Object i : holder
                )
        {
            if (t.equals(i))
            {
                contains = true;
            }
        }
        return contains;
        */
    }



}
