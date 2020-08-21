package com.designpattern.decorator.v1;

public class CakeWithExtraEgg extends Cake
{
    @Override
    public String getDesc()
    {
        return super.getDesc() + " with extra egg";
    }

    @Override
    public int getPrice()
    {
        return super.getPrice() + 1;
    }
}
