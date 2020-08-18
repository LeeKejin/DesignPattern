package com.designpattern.prototype;

public class Mail implements Cloneable
{
    private String name;
    private String emailAddress;
    private String content;

    public Mail()
    {
        System.out.println( "Default constructor" );
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getEmailAddress()
    {
        return emailAddress;
    }

    public void setEmailAddress( String emailAddress )
    {
        this.emailAddress = emailAddress;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent( String content )
    {
        this.content = content;
    }

    @Override
    public String toString()
    {
        return "Mail{" +
            "name='" + name + '\'' +
            ", emailAddress='" + emailAddress + '\'' +
            ", content='" + content + '\'' +
            '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        System.out.println( "Clone mail" );
        return super.clone();
    }
}
