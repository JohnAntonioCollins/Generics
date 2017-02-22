package collins.john;

import java.util.Arrays;

/**
 * Created by johncollins on 2/22/17.
 */
public class MyMap<P, K, V>
{
    private P pair;
    Keys<Pair> keys;

    public MyMap()
    {
        keys = new Keys<>();
    }

    public MyMap(K k, V v)
    {
        keys = new Keys<>();
        this.myPut(k, v);
    }

    public void myPut(K k, V v)
    {
//1. see if key is new, if so add key to Key, add value to Value.  make map of Tuples
        Pair pair = new Pair(k, v);
        keys.myAdd(pair);
        pair.index = keys.getMySize() - 1;
    }

    public V get(K k) // needs try/catch
    {
        Pair match = null;
        for (int i = 0; i < keys.getMySize(); i++)
        {
            if (keys.myGetAt(i).equals(k))
            {
                match = (Pair) keys.myGetAt(i);
            }
        }
        return (V) match.getValue();

    }


    ////////////Pair class////////
    class Pair<K, V>
    {
        public final K key;
        public V value;
        public int index;

        public Pair(K a, V b)
        {
            key = a;
            value = b;
        }

        public V getValue()
        {
            return value;
        }
    }

    private class Keys<T>
    {

        private T t;
        private Object[] empty;
        private Object[] temp;
        private Object[] holder;
        private int mySize;
        private boolean myEmpty;
        boolean contains;

        public Keys()
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
            if (!contains)
            {
                //copy holder, increase size, add new T at end, copy back to holder. mySize++
                temp = Arrays.copyOf(holder, holder.length + 10);
                temp[mySize] = t;
                holder = Arrays.copyOf(temp, temp.length);
                temp = empty;
                mySize++;
            }

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

        }


    }

    ////////////////////////////MAY NOT NEED
    private class Values<T>
    {
        private T t;
        private Object[] empty;
        private Object[] temp;
        private Object[] holder;
        private int mySize;
        private boolean myEmpty;
        boolean contains;

        public Values()
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
            this.myContains(t);
            //copy holder, increase size, add new T at end, copy back to holder. mySize++
            temp = Arrays.copyOf(holder, holder.length + 10);
            temp[mySize] = t;
            holder = Arrays.copyOf(temp, temp.length);
            temp = empty;
            mySize++;

        }

        public void myAdd(T t, int i)
        {
            if (i < mySize)
            {
                holder[i] = t;
            } else
            {
                //copy holder, increase size, add new T at end, copy back to holder. mySize++
                temp = Arrays.copyOf(holder, holder.length + 10);
                temp[mySize] = t;
                holder = Arrays.copyOf(temp, temp.length);
                temp = empty;
                mySize++;
            }
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

        }

    }

}
