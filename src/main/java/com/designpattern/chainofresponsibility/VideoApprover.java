package com.designpattern.chainofresponsibility;

public class VideoApprover extends Approver
{
    public void deploy( Course course )
    {
        if ( course.getVideo() != null )
        {
            System.out.println( "Found videos in " + course.getName() + ", approve!" );
            if ( approver != null )
            {
                approver.deploy( course );
            }
        }
        else
        {
            System.out.println( "Disapprove course " + course.getName() + " due to lack of video " );
            return;
        }
    }
}
