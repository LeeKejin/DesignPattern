package com.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CourseCatalogue extends CatalogueComponent
{
    private List< CatalogueComponent > items = new ArrayList< CatalogueComponent >();
    private String name;
    private Integer level;

    public CourseCatalogue( String name, Integer level )
    {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add( CatalogueComponent catalogueComponent )
    {
        items.add( catalogueComponent );
    }

    @Override
    public String getName( CatalogueComponent catalogueComponent )
    {
        return name;
    }

    @Override
    public void remove( CatalogueComponent catalogueComponent )
    {
        items.remove( catalogueComponent );
    }

    @Override
    public void print()
    {
        System.out.println( name );
        for ( CatalogueComponent catalogueComponent : items )
        {
            System.out.print( "   " );

            String spaces = "";

            if ( this.level != null )
            {
                for ( int i = 0; i < this.level; i++ )
                {
                    spaces += "    ";
                }
            }
            System.out.print( spaces );
            catalogueComponent.print();
        }
    }
}
