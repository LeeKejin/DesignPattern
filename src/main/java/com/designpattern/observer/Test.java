package com.designpattern.observer;

public class Test
{
    public static void main( String[] args )
    {
        Course course = new Course( "Java course" );
        Teacher teacher = new Teacher( "ABC" );
        course.addObserver( teacher );
        Teacher teacher1 = new Teacher( "DEF" );
        course.addObserver( teacher1 );

        Question question = new Question();
        question.setContents( "Main function question" );
        question.setUserName( "XYZ" );

        course.generateQuestion( course, question );
    }
}
