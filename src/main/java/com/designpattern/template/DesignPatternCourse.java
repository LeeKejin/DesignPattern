package com.designpattern.template;

public class DesignPatternCourse extends AbstractCourse
{
    void packageCourse()
    {
        System.out.println( "Provide java source code" );
    }

    @Override
    protected boolean isRequiredDocument()
    {
        return true;
    }
}
