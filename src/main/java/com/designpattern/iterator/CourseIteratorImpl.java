package com.designpattern.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator
{
    private List courses;
    private int position = 0;

    public CourseIteratorImpl( List courses )
    {
        this.courses = courses;
    }

    public Course nextCourse()
    {
        if ( position < courses.size() )
        {
            Course course = ( Course ) courses.get( position );
            System.out.println( "Position:" + position );
            position++;
            return course;
        }
        return null;
    }

    public boolean isLastCourse()
    {
        return position >= courses.size();
    }
}
