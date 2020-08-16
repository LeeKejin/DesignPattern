package com.designpattern.builder;

public abstract class AbstractCourseBuilder
{
    public abstract void  buildCourseName(String courseName);
    public abstract void  buildCoursePPT(String coursePPT);
    public abstract void  buildCourseQA(String courseQA);
    public abstract Course createCourse();
}
