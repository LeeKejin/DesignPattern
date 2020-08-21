package com.designpattern.adapter;

public class PowerAdapter implements DC5
{
    AC220 ac = new AC220();

    public int outputDC5()
    {
        int adapterInput = ac.outputAC220();
        int adapterOutPut = adapterInput / 44;

        System.out.println( "Input 220V output 5V" );
        return adapterOutPut;
    }
}
