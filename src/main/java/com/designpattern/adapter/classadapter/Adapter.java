package com.designpattern.adapter.classadapter;

public class Adapter extends Adaptee implements Target
{
    public void request()
    {
        super.adapteeRequest();
    }
}
