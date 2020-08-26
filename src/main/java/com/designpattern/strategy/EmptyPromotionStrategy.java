package com.designpattern.strategy;

public class EmptyPromotionStrategy implements PromotionStrategy
{
    public void executeStrategy()
    {
        System.out.println( "Empty promotion strategy" );
    }
}
