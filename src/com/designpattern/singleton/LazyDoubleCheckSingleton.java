package com.designpattern.singleton;

public class LazyDoubleCheckSingleton
{
    private volatile static LazyDoubleCheckSingleton lazySingleton = null;//volatile prevent reordering 2 3

    private LazyDoubleCheckSingleton()
    {

    }

    public synchronized static LazyDoubleCheckSingleton getInstance()
    {
        if ( lazySingleton == null )
        {
            synchronized ( LazyDoubleCheckSingleton.class )
            {
                if ( lazySingleton == null )
                {
                    lazySingleton = new LazyDoubleCheckSingleton();
                    //1. Allocate memory to the obj
                    //2. Make lazySingleton point to the new memory
                    //3. Initialize the instance
                    // Sequence of 2, 3 would be different, to prevent it, using volatile!
                    // If threadA execute 3rd step first, then threadB may access the instance which is not initialized
                }
            }
        }
        return lazySingleton;
    }
}
