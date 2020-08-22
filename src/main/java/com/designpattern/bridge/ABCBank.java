package com.designpattern.bridge;

public class ABCBank extends Bank
{

    Account openAccount()
    {
        System.out.println( "Open ABCBank Account" );
        super.getAccount().openAccount();
        return super.getAccount();
    }

}
