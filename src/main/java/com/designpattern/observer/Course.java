package com.designpattern.observer;

import java.util.Observable;

public class Course extends Observable
{
    private String courseName;

    public Course( String courseName )
    {
        this.courseName = courseName;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public void generateQuestion( Course course, Question question )
    {
        System.out.println( question.getUserName() + " has a question at course: " + course.getCourseName() );
        setChanged();
        notifyObservers( question );
    }
}
