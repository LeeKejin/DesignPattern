package com.designpattern.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Test
{
    public static void main( String[] args )
    {
        List< String > departments = new ArrayList< String >();
        departments.add( "QA" );
        departments.add( "PM" );
        departments.add( "DEVELOP" );
        departments.add( "SALE" );

        for ( int i = 0; i < 10; i++ )
        {
            Manager manager =
                ( Manager ) EmployeeFactory.getManager( departments.get( ( int ) ( Math.random() * 4 ) ) );
            manager.report();
        }

    }
}
