package com.designpattern.bridge;

public abstract class Bank
{
    Account account;

    public Account getAccount()
    {
        return account;
    }

    public void setAccount( Account account )
    {
        this.account = account;
    }

    abstract Account openAccount();

}
