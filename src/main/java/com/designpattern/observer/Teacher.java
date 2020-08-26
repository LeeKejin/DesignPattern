package com.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer
{
    private String name;

    public Teacher( String name )
    {
        this.name = name;
    }

    public void update( Observable o, Object arg )
    {
        Course course = ( Course ) o;
        Question question = ( Question ) arg;
        System.out.println(
            name + "'s course: " + course.getCourseName() + " receive a question from" + question.getUserName()
                + " with contents: " + question.getContents() );
    }
}
