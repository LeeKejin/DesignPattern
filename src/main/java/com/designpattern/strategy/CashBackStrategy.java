package com.designpattern.strategy;

public class CashBackStrategy implements PromotionStrategy
{
    public void executeStrategy()
    {
        System.out.println( "Cash back" );
    }
}
