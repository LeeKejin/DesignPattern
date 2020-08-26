package com.designpattern.proxy.staticproxy;

import com.designpattern.proxy.Order;
import com.designpattern.proxy.OrderService;
import com.designpattern.proxy.OrderServiceImpl;
import com.designpattern.proxy.db.DataSourceContextHolder;

public class OrderServiceStaticProxy
{
    private OrderService orderService;

    public int saveOrder( Order order )
    {
        beforeMethod( order );
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder( order );

        afterMethod();
        return result;
    }

    private void beforeMethod( Order order )
    {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println( "Static proxy allocate to [db" + dbRouter + "] process data" );
        DataSourceContextHolder.setDBType( "db" + dbRouter );
        System.out.println( "Static proxy before code" );
    }

    private void afterMethod()
    {
        System.out.println( "Static proxy after code" );
    }
}
