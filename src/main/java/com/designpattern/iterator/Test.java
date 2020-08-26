package com.designpattern.iterator;

public class Test
{
    public static void main( String[] args )
    {
        CourseAggregate courseAggregate = new CourseAggregateImpl();
        Course c1 = new Course();
        c1.setName( "Java" );
        Course c2 = new Course();
        c2.setName( "C++" );
        Course c3 = new Course();
        c3.setName( "Python" );

        courseAggregate.addCourse( c1 );
        courseAggregate.addCourse( c2 );
        courseAggregate.addCourse( c3 );

        CourseIterator iterator = courseAggregate.getCourseIterator();
        while ( !iterator.isLastCourse() )
        {
            System.out.println( iterator.nextCourse().getName() );
        }
        courseAggregate.removeCourse( c1 );
        CourseIterator iterator1 = courseAggregate.getCourseIterator();
        while ( !iterator1.isLastCourse() )
        {
            System.out.println( iterator1.nextCourse() + "" );
        }
        //        while ( !courseAggregate.getCourseIterator().isLastCourse() )
        //        {
        //            System.out.println( courseAggregate.getCourseIterator().nextCourse().getName() );
        //        }
    }
}
