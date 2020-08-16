package com.designpattern.builder;

public class Test
{
    public static void main( String[] args )
    {
        Coach coach = new Coach();
        Course course = coach.createCourseByBuilder( "Java", "Java PPT", "Java QA" );
        System.out.println( course );

    }

}
