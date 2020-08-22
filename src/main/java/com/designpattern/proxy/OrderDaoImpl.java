package com.designpattern.proxy;

public class OrderDaoImpl implements OrderDao
{
    public int insert( Order order )
    {
        System.out.println( "Insert order via dao successfully" );
        return 1;
    }
}
