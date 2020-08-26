package com.designpattern.chainofresponsibility;

public class Test
{
    public static void main( String[] args )
    {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName( "Java Course" );
        course.setArticle( "Article" );
        course.setVideo( "Video" );

        //        articleApprover.setNextApprover( videoApprover );
        //        articleApprover.deploy( course );

        videoApprover.setNextApprover( articleApprover );
        videoApprover.deploy( course );
    }
}
