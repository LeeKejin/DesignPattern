package com.designpattern.observer;

public class Question
{
    private String userName;

    private String contents;

    public String getUserName()
    {
        return userName;
    }

    public void setUserName( String userName )
    {
        this.userName = userName;
    }

    public String getContents()
    {
        return contents;
    }

    public void setContents( String contents )
    {
        this.contents = contents;
    }
}
