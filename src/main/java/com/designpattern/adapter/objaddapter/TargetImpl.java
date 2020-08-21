package com.designpattern.adapter.objaddapter;

import com.designpattern.adapter.classadapter.Target;

public class TargetImpl implements Target
{
    public void request()
    {
        System.out.println( "TargetImpl method" );
    }
}
