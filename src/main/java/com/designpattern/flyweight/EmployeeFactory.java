package com.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory
{
    private static final Map< String, Employee > EMPLOYEE_MAP = new HashMap< String, Employee >();

    public static Employee getManager( String department )
    {
        Manager manager = ( Manager ) EMPLOYEE_MAP.get( department );
        if ( manager == null )
        {
            System.out.println( "--------------------------------------------" );
            manager = new Manager( department );
            System.out.println( "Create " + department + " manager " );

            manager.setReportCentents( "The contents of report of " + department );

            System.out.println( manager.getReportCentents() );
            System.out.println( "--------------------------------------------" );
            EMPLOYEE_MAP.put( department, manager );
        }
        return manager;
    }
}
