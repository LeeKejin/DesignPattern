package com.designpattern.command;

public class CouresVideo
{
    private String name;

    public CouresVideo( String name )
    {
        this.name = name;
    }

    public void open()
    {
        System.out.println( "Open " + name );
    }

    public void close()
    {
        System.out.println( "Close " + name );
    }
}
