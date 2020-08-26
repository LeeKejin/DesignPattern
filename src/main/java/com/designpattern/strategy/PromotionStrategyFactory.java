package com.designpattern.strategy;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory
{
    private static final PromotionStrategy EMPTY_PROMOTION = new EmptyPromotionStrategy();
    private static Map< String, PromotionStrategy > promotionMap = new HashMap< String, PromotionStrategy >();

    static
    {
        promotionMap.put( PromotionKey.FREE, new FreeStrategy() );
        promotionMap.put( PromotionKey.PRICE_REDUCE, new PriceReduceStrategy() );
        promotionMap.put( PromotionKey.CASH_BACK, new CashBackStrategy() );
    }

    private PromotionStrategyFactory()
    {

    }

    public static PromotionStrategy getPromotionStrategy( String promotionName )
    {
        PromotionStrategy promotionStrategy = promotionMap.get( promotionName );
        return promotionStrategy == null ? EMPTY_PROMOTION : promotionStrategy;
    }

    private interface PromotionKey
    {
        String FREE = "FREE";
        String PRICE_REDUCE = "PRICE_REDUCE";
        String CASH_BACK = "CASH_BACK";
    }
}
