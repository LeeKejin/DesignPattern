package com.designpattern.singleton;

public class StaticInnerClassSingleton
{
    private StaticInnerClassSingleton()
    {
    }

    public static StaticInnerClassSingleton getInstance()
    {
        return InnerClass.staticInnerClassSingleton;
    }

    private static class InnerClass
    {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
}
