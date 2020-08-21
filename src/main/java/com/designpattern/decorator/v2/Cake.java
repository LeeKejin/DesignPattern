package com.designpattern.decorator.v2;

public class Cake extends AbstractCake
{
    protected String getDesc()
    {
        return "A pancake ";
    }

    protected int getPrice()
    {
        return 8;
    }
}
