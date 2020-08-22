package com.designpattern.bridge;

public class DepositAccount implements Account
{
    public Account openAccount()
    {
        System.out.println( "Open Deposit account" );
        return new DepositAccount();
    }

    public void showAccountType()
    {
        System.out.println( "The account type is deposit" );
    }
}
