package com.designpattern.mediator;

import java.util.Date;

public class StudyGroup
{
    public static void showMessage( User user, String message )//this is mediator
    {
        System.out.println( new Date().toString() + user.getName() + " said: " + message );
    }
}
