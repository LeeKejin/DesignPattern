package com.designpattern.prototype.clone;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Test
{
    public static void main( String[] args )
        throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, IllegalAccessException
    {
        Pig p1 = new Pig();
        p1.setBirthday( new Date( 1111L ) );
        p1.setName( "Name1" );
        p1.getFriends().add( new Date() );
        p1.getFriends().add( new Date() );
        Pig p2 = ( Pig ) p1.clone();

        System.out.println( p1 );
        System.out.println( p2 );
        p1.getBirthday().setTime( 12121212L );
        System.out.println( p1 );
        System.out.println( p2 );
        /*
        Property broken singleton
         */
        //        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //
        //        Method method = HungrySingleton.class.getDeclaredMethod( "clone" );
        //        method.setAccessible( true );
        //        HungrySingleton cloneSingleton = ( HungrySingleton ) method.invoke( hungrySingleton );
        //
        //        System.out.println( hungrySingleton );
        //        System.out.println( cloneSingleton );

    }
}
