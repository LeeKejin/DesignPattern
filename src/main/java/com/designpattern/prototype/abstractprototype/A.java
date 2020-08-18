package com.designpattern.prototype.abstractprototype;

public class A implements Cloneable
{
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
