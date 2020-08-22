package com.designpattern.proxy;

public class Order
{
    private Object orderInfo;
    private int userId;

    public Object getOrderInfo()
    {
        return orderInfo;
    }

    public void setOrderInfo( Object orderInfo )
    {
        this.orderInfo = orderInfo;
    }

    public int getUserId()
    {
        return userId;
    }

    public void setUserId( int userId )
    {
        this.userId = userId;
    }
}
