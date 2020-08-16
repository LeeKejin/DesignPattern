package com.designpattern.builder.v2;

public class Course
{
    private String courseName;
    private String coursePPT;
    private String courseQA;

    public Course( CourseBuilder courseBuilder )
    {
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseQA = courseBuilder.courseQA;
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

    public static class CourseBuilder
    {
        private String courseName;
        private String coursePPT;
        private String courseQA;

        public CourseBuilder buildCourseName( String courseName )
        {
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder buildCoursePPT( String coursePPT )
        {
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder buildCourseQA( String courseQA )
        {
            this.courseQA = courseQA;
            return this;
        }

        public Course build()
        {
            return new Course( this );
        }
    }
}
