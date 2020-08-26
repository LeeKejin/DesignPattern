package com.designpattern.strategy;

public class Promotion
{
    PromotionStrategy promotionStrategy;

    public Promotion( PromotionStrategy promotionStrategy )
    {
        this.promotionStrategy = promotionStrategy;
    }

    public void execute()
    {
        promotionStrategy.executeStrategy();
    }
}
