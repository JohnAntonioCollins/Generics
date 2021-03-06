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
        Pair pair = new Pair(k, v);
        keys.myAdd(pair);
        pair.index = keys.getMySize() - 1;
    }
    public void myRemove(K k){
//this will remove a key/val pair and heal the index
        for (int i = 0; i < keys.getMySize(); i++)
        {
            Pair query = keys.myGetAt(i);
            if (query.key.equals(k))
            {
                keys.myRemove(i);
            }
        }
    }

    public V myGet(K k)
    {
        Pair match = null;
        for (int i = 0; i < keys.getMySize(); i++)
        {
            Pair query = keys.myGetAt(i);
            if (query.key.equals(k))
            {
                match = keys.myGetAt(i);
            }
        }
        return (V) match.value;
    }
    public void myClear(){
        keys.myClear();
    }
    public int mySize(){
        return keys.getMySize();
    }
    public boolean myIsEmpty(){
        return keys.isMyEmpty();
    }

    ////////////PAIR CLASS////////
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
    }

    //////////KEYS CLASS/////////////
    private class Keys<Pair>
    {
        private Pair t;
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

        public void myAdd(Pair t)
        {
            this.doesContain(t);
            if (!contains)
            {
                temp = Arrays.copyOf(holder, holder.length + 1);
                temp[mySize] = t;
                holder = Arrays.copyOf(temp, temp.length);
                temp = empty;
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

        public Pair myGetAt(int i)
        {
            return (Pair) holder[i];
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

        private void doesContain(Pair t)
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
    }
}
