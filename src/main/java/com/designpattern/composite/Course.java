package com.designpattern.composite;

public class Course extends CatalogueComponent
{
    private String name;
    private double price;

    public Course( String name, double price )
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName( CatalogueComponent catalogueComponent )
    {
        return name;
    }

    @Override
    public double getPrice( CatalogueComponent catalogueComponent )
    {
        return price;
    }

    @Override
    public void print()
    {
        System.out.println( "Course " + name + " with Price $" + price );
    }
}
