package com.designpattern.appearance;

public class Test
{
    public static void main( String[] args )
    {
        GiftExchangeService exchangeService = new GiftExchangeService();
        PointsGift pointsGift = new PointsGift( "T-shirt" );
        exchangeService.giftExchange( pointsGift );
    }
}
