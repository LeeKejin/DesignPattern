package com.designpattern.proxy.dynamicproxy;

import com.designpattern.proxy.Order;
import com.designpattern.proxy.OrderService;
import com.designpattern.proxy.OrderServiceImpl;

public class Test
{
    public static void main( String[] args )
    {
        Order order = new Order();
        order.setUserId( 2 );
        OrderService orderService = ( OrderService ) new OrderServiceDynamicProxy( new OrderServiceImpl() ).bind();
        orderService.saveOrder( order );
    }
}
