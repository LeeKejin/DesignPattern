package com.designpattern.chainofresponsibility;

public abstract class Approver
{
    protected Approver approver; //!!!!!The class contains itself, but may not equal to 'this'

    public void setNextApprover( Approver approver )
    {
        this.approver = approver;
    }

    public abstract void deploy( Course course );
}
