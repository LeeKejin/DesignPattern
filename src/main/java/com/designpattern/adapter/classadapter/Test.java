package com.designpattern.adapter.classadapter;

public class Test
{
    public static void main( String[] args )
    {
        Target target = new TargetImpl();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
