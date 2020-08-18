package com.designpattern.prototype;

import java.text.MessageFormat;

public class MailUtil
{
    public static void sendMail( Mail mail )
    {
        String sendContents = "Send email to {0} whose email is {1}, with {2} ";
        System.out
            .println( MessageFormat.format( sendContents, mail.getName(), mail.getEmailAddress(), mail.getContent() ) );
    }

    public static void saveOriginalMailRecord( Mail mail )
    {
        System.out.println( "Save original mail " + mail.getContent() );
    }
}
