package com.designpattern.decorator.v2;

public class Test
{
    public static void main( String[] args )
    {
        AbstractCake abstractCake = new Cake();
        abstractCake = new EggDecorator( abstractCake );
        abstractCake = new EggDecorator( abstractCake );
        abstractCake = new EggDecorator( abstractCake );

        abstractCake = new SugarDecorator( abstractCake );
        abstractCake = new SugarDecorator( abstractCake );

        System.out.println( abstractCake.getDesc() );

    }
}
