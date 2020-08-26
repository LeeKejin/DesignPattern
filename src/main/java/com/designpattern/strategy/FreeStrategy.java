package com.designpattern.strategy;

public class FreeStrategy implements PromotionStrategy
{

    public void executeStrategy()
    {
        System.out.println( "Give away for free" );
    }
}
