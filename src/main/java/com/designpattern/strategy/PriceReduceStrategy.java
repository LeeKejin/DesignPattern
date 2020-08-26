package com.designpattern.strategy;

public class PriceReduceStrategy implements PromotionStrategy
{
    public void executeStrategy()
    {
        System.out.println( "Reduce price by ??? price" );
    }
}
