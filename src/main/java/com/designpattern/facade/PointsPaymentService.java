package com.designpattern.facade;

public class PointsPaymentService
{
    public boolean pay( PointsGift gift )
    {
        System.out.println( "Paid!" );
        return true;
    }
}
