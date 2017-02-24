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
        holder = new Object[0];
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
        if (!contains)
        {
            holder = Arrays.copyOf(holder, holder.length + 1);
            holder[mySize] = t;
            Arrays.sort(holder);
            mySize++;
        }
    }

    public void myRemove(int index)
    {
        int start = index;
        for (int i = start; i < mySize-1; i++)
        {
            holder[index] = holder[index + 1];
            index++;
        }
        mySize--;
        holder = Arrays.copyOf(holder, mySize);
        Arrays.sort(holder);
    }

    public T myGetAt(int i)
    {
        return (T)holder[i];
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

    }
}
