package com.designpattern.bridge;

public class Test
{
    public static void main( String[] args )
    {
        Bank abcBank = new ABCBank();
        abcBank.setAccount( new DepositAccount() );
        Account account = abcBank.openAccount();
        account.showAccountType();

        abcBank.setAccount( new SavingAccount() );
        Account abcSavingAccount = abcBank.openAccount();
        abcSavingAccount.showAccountType();

        Bank xyzBank = new XYZBank();
        xyzBank.setAccount( new SavingAccount() );
        Account savingAccount = xyzBank.openAccount();
        savingAccount.showAccountType();

    }
}
