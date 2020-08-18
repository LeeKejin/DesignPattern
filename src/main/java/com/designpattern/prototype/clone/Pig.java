package com.designpattern.prototype.clone;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pig implements Cloneable
{
    private String name;
    private Date birthday;
    private List< Object > friends = new ArrayList< Object >();

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public Date getBirthday()
    {
        return birthday;
    }

    public void setBirthday( Date birthday )
    {
        this.birthday = birthday;
    }

    public List< Object > getFriends()
    {
        return friends;
    }

    public void setFriends( List< Object > friends )
    {
        this.friends = friends;
    }

    @Override
    public String toString()
    {
        return "Pig{" +
            "name='" + name + '\'' +
            ", birthday='" + birthday + '\'' +
            '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Pig pig = ( Pig ) super.clone(); //shallow copy
        pig.birthday = ( Date ) pig.birthday.clone();//deep copy, copy the property of obj
        pig.friends = new ArrayList< Object >( friends );
        return pig;

    }
}
