package com.designpattern.decorator.v2;

public class CakeDecorator extends AbstractCake
{
    private AbstractCake cake;

    public CakeDecorator( AbstractCake cake )
    {
        this.cake = cake;
    }

    protected String getDesc()
    {
        return this.cake.getDesc();
    }

    protected int getPrice()
    {
        return this.cake.getPrice();
    }
}
