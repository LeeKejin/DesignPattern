package com.designpattern.proxy.staticproxy;

import com.designpattern.proxy.Order;

public class Test
{
    public static void main( String[] args )
    {
        Order order = new Order();
        order.setUserId( 2 );
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder( order );
    }
}
