package com.designpattern.builder;
public class Course
{
    private String courseName;
    private String coursePPT;
    private String courseQA;

    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName( String courseName )
    {
        this.courseName = courseName;
    }

    public String getCoursePPT()
    {
        return coursePPT;
    }

    public void setCoursePPT( String coursePPT )
    {
        this.coursePPT = coursePPT;
    }

    public String getCourseQA()
    {
        return courseQA;
    }

    public void setCourseQA( String courseQA )
    {
        this.courseQA = courseQA;
    }

    @Override
    public String toString()
    {
        return "Course{" +
            "courseName='" + courseName + '\'' +
            ", coursePPT='" + coursePPT + '\'' +
            ", courseQA='" + courseQA + '\'' +
            '}';
    }
}
