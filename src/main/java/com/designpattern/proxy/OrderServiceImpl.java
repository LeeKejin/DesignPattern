package com.designpattern.proxy;

public class OrderServiceImpl implements OrderService
{
    private OrderDao orderDao;

    public int saveOrder( Order order )
    {
        orderDao = new OrderDaoImpl();
        System.out.println( "Service call Dao to insert" );
        return orderDao.insert( order );
    }
}
