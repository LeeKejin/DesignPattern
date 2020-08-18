package com.designpattern.prototype;

public class Test
{
    public static void main( String[] args ) throws CloneNotSupportedException
    {
        Mail mail = new Mail();
        mail.setContent( "Initialize..." );
        for ( int i = 0; i < 10; i++ )
        {
            Mail clonedMail = ( Mail ) mail.clone();
            clonedMail.setName( "Name" + i );
            clonedMail.setEmailAddress( "Email Address" + i );
            clonedMail.setContent( "Contents" + i );
            MailUtil.sendMail( clonedMail );
        }
        MailUtil.saveOriginalMailRecord( mail );
    }
}
