package com.designpattern.bridge;

public class XYZBank extends Bank
{
    Account openAccount()
    {
        System.out.println( "Open XYZBank Account" );
        super.getAccount().openAccount();
        return super.getAccount();
    }
}
