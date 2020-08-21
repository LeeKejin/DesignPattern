package com.designpattern.facade;

public class DeliveryService
{
    public String ship( PointsGift gift )
    {
        System.out.println( "Ship the gift" );
        return "Ship No: 123";
    }
}
