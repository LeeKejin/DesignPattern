package com.designpattern.builder;

public class Coach
{
    CourseBuilder builder = new CourseBuilder();

    public Course createCourseByBuilder( String courseName, String coursePPT, String courseQA )
    {
        builder.buildCourseName( courseName );
        builder.buildCoursePPT( coursePPT );
        builder.buildCourseQA( courseQA );
        return builder.createCourse();
    }
}
