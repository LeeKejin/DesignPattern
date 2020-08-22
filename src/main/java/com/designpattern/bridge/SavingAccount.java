package com.designpattern.bridge;

public class SavingAccount implements Account
{
    public Account openAccount()
    {
        System.out.println( "Open Saving Account" );
        return new SavingAccount();
    }

    public void showAccountType()
    {
        System.out.println( "Account type is saving" );
    }
}
