package com.designpattern.builder.v2;

import com.designpattern.builder.v2.Course.CourseBuilder;

public class Test
{
    public static void main( String[] args )
    {
        CourseBuilder builder = new CourseBuilder();
        Course course =
            builder.buildCourseName( "Java" ).buildCoursePPT( "Java PPT" ).buildCourseQA( "Java QA" ).build();
        System.out.println( course );
    }
}
