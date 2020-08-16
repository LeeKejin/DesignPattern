package com.designpattern.singleton;

public class LazySingleton
{
    static boolean flag = true;
    private static LazySingleton lazySingleton = null;

    //When using lazySingleton, generating multiple instances with reflection cannot be avoided
    private LazySingleton()
    {
        if ( flag )
        {
            flag = false;
        }
        else
        {
            throw new RuntimeException( "CANNOT INITIALISE NEW INSTANCE WITH SINGLETON" );
        }
    }

    public synchronized static LazySingleton getInstance()
    {
        if ( lazySingleton == null )
        {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
