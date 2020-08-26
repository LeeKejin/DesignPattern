package com.designpattern.strategy;

public class Test
{
    public static void main( String[] args )
    {
        String promotionKey = "FREE";
        Promotion promotion = new Promotion( PromotionStrategyFactory.getPromotionStrategy( promotionKey ) );
        promotion.execute();
    }
}
