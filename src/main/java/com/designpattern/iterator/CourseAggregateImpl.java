package com.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate
{
    List courseList;

    public CourseAggregateImpl()
    {
        this.courseList = new ArrayList();
    }

    public void addCourse( Course course )
    {
        courseList.add( course );
    }

    public void removeCourse( Course course )
    {
        courseList.remove( course );
    }

    public List getCourseList()
    {
        return courseList;
    }

    public void setCourseList( List courseList )
    {
        this.courseList = courseList;
    }

    public CourseIterator getCourseIterator()
    {
        return new CourseIteratorImpl( courseList );
    }
}
