package com.designpattern.chainofresponsibility;

public class ArticleApprover extends Approver
{
    public void deploy( Course course )
    {
        if ( course.getArticle() != null )
        {
            System.out.println( "Found articles in " + course.getName() + ", approve!" );
            if ( approver != null )
            {
                approver.deploy( course );
            }
        }
        else
        {
            System.out.println( "Disapprove course " + course.getName() + " due to lack of article" );
            return;
        }
    }
}
