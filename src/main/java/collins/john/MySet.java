package collins.john;

/**
 * Created by johncollins on 2/22/17.
 */
public class MySet<T> extends MyArrayList
{

    public void myAddtoSet(T t)
    {
        if (!this.myContains(t))
        {
            this.myAdd(t);
        }
    }

}
