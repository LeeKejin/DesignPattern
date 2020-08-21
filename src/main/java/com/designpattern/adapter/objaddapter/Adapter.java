package com.designpattern.adapter.objaddapter;

public class Adapter implements Target
{
    private Adaptee adaptee = new Adaptee();

    public void request()
    {
        adaptee.adapteeRequest();
    }
}
