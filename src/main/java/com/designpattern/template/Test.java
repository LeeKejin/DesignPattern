package com.designpattern.template;

public class Test
{
    public static void main( String[] args )
    {
        System.out.println( "Design patter course" );
        AbstractCourse dpCourse = new DesignPatternCourse();
        dpCourse.makeCourse();

        System.out.println( "FE course" );
        AbstractCourse feCourse = new FECourse();
        feCourse.makeCourse();
    }
}
