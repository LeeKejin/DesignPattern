package com.designpattern.singleton;

import java.io.Serializable;

public class HungrySingleton implements Serializable, Cloneable
{
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton()
    {
        if ( hungrySingleton != null )
        {
            throw new RuntimeException( "CANNOT INITIALISE ANOTHER INSTANCE WITH SINGLETON!!!!" );
        }
    }

    public static HungrySingleton getInstance()
    {
        return hungrySingleton;
    }

    //Reflection method in ObjectStreamClass, anti Serializable
    private Object readResolve()
    {
        return hungrySingleton;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return getInstance();
    }
}
