package com.designpattern.decorator.v2;

public class SugarDecorator extends CakeDecorator
{
    public SugarDecorator( AbstractCake cake )
    {
        super( cake );
    }

    @Override
    protected String getDesc()
    {
        return super.getDesc() + " With Extra Sugar";
    }

    @Override
    protected int getPrice()
    {
        return super.getPrice() + 2;
    }
}
