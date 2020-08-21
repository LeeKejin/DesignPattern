package com.designpattern.decorator.v2;

public class EggDecorator extends CakeDecorator
{
    public EggDecorator( AbstractCake cake )
    {
        super( cake );
    }

    @Override
    protected int getPrice()
    {
        return super.getPrice() + 3;
    }

    @Override
    protected String getDesc()
    {
        return super.getDesc() + " with Extra Egg";
    }
}
