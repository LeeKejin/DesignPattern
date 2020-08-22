package com.designpattern.proxy.staticproxy;

import com.designpattern.proxy.Order;
import com.designpattern.proxy.OrderService;
import com.designpattern.proxy.OrderServiceImpl;

public class OrderServiceStaticProxy
{
    private OrderService orderService;

    public int saveOrder( Order order )
    {
        beforeMethod();
        orderService = new OrderServiceImpl();
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println( "Static proxy allocate to db " + dbRouter + " process data" );
        afterMethod();
        return orderService.saveOrder( order );
    }

    private void beforeMethod()
    {
        System.out.println( "Static proxy before code" );
    }

    private void afterMethod()
    {
        System.out.println( "Static proxy after code" );
    }
}
