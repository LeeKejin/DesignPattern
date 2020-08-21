package com.designpattern.facade;

public class QualifyService
{
    public boolean isAvailable( PointsGift gift )
    {
        System.out.println( "Check" + gift.getName() );
        return true;
    }
}
