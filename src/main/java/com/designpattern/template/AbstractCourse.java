package com.designpattern.template;

public abstract class AbstractCourse
{
    protected final void makeCourse()
    {
        createSlide();
        recordVideo();
        if ( isRequiredDocument() ) writeDocument();
        packageCourse();
    }

    final void createSlide()
    {
        System.out.println( "Make Slides" );
    }

    final void recordVideo()
    {
        System.out.println( "Record video" );
    }

    final void writeDocument()
    {
        System.out.println( "Write doc" );
    }

    //hook method
    protected boolean isRequiredDocument()
    {
        return false;
    }

    //different courses need different materials, that needed to be done via subclass
    abstract void packageCourse();
}
