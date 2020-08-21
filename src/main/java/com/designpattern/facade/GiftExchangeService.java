package com.designpattern.facade;

public class GiftExchangeService
{
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private DeliveryService deliveryService = new DeliveryService();

    public void setQualifyService( QualifyService qualifyService )
    {
        this.qualifyService = qualifyService;
    }

    public void setPointsPaymentService( PointsPaymentService pointsPaymentService )
    {
        this.pointsPaymentService = pointsPaymentService;
    }

    public void setDeliveryService( DeliveryService deliveryService )
    {
        this.deliveryService = deliveryService;
    }

    public void giftExchange( PointsGift gift )
    {
        if ( qualifyService.isAvailable( gift ) )
        {
            if ( pointsPaymentService.pay( gift ) )
            {
                String num = deliveryService.ship( gift );
                System.out.println( "Order has been placed with " + num );
            }
        }
    }
}
