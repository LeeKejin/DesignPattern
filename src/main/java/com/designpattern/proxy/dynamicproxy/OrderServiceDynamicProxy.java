package com.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.designpattern.proxy.Order;
import com.designpattern.proxy.db.DataSourceContextHolder;

public class OrderServiceDynamicProxy implements InvocationHandler
{
    public Object target;

    public OrderServiceDynamicProxy( Object target )
    {
        this.target = target;
    }

    public Object bind()
    {
        Class clazz = target.getClass();
        return Proxy.newProxyInstance( clazz.getClassLoader(), clazz.getInterfaces(), this );
    }

    public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable
    {
        Object argObj = args[ 0 ];
        beforeMethod( argObj );
        Object obj = method.invoke( target, args );
        afterMethod();
        return obj;
    }

    private void beforeMethod( Object obj )
    {
        int userId = 0;
        System.out.println( "Dynamic proxy before" );
        if ( obj instanceof Order )
        {
            Order order = ( Order ) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println( "Dynamic proxy allocate to [db" + dbRouter + "] process data" );
        DataSourceContextHolder.setDBType( "db" + dbRouter );
    }

    private void afterMethod()
    {
        System.out.println( "Dynamic proxy after code" );
    }
}
