package com.designpattern.command;

public class Test
{
    public static void main( String[] args )
    {
        CouresVideo video = new CouresVideo( "Java Course" );
        Command open = new OpenCourseCommand( video );
        Command close = new CloseCourseCommand( video );

        Staff staff = new Staff();
        staff.addCommand( open );
        staff.addCommand( close );
        staff.executeCommands();
    }
}
