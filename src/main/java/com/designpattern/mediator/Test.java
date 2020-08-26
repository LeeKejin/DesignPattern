package com.designpattern.mediator;

public class Test
{
    public static void main( String[] args )
    {
        User user1 = new User();
        user1.setName( "User 1" );
        user1.sendMessage( "Im user 1" );

        User user2 = new User();
        user2.setName( "User 2" );
        user2.sendMessage( "Im user 2" );
    }
}
