package com.designpattern.singleton;

public class T implements Runnable
{
    public void run()
    {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println( Thread.currentThread().getName() + "----" + lazySingleton );
    }
}
