package com.designpattern.decorator.v1;

public class CakeWithExtraSugarAndEgg extends CakeWithExtraEgg
{
    @Override
    public int getPrice()
    {
        return super.getPrice() + 2;
    }

    @Override
    public String getDesc()
    {
        return super.getDesc() + " with extra sugar";
    }
}
