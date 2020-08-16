package com.designpattern.builder;

public class CourseBuilder extends AbstractCourseBuilder
{
    private Course course = new Course();

    public void buildCourseName( String courseName )
    {
        course.setCourseName( courseName );
    }

    public void buildCoursePPT( String coursePPT )
    {
        course.setCoursePPT( coursePPT );
    }

    public void buildCourseQA( String courseQA )
    {
        course.setCourseQA( courseQA );
    }

    public Course createCourse()
    {
        return course;
    }
}
