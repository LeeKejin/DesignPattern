package com.designpattern.singleton;

public enum EnumInstance
{
    INSTANCE;
    private Object data;

    public static EnumInstance getInstance()
    {
        return INSTANCE;
    }

    public Object getData()
    {
        return data;
    }

    public void setData( Object data )
    {
        this.data = data;
    }
}
