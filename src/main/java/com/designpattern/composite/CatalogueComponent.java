package com.designpattern.composite;

public abstract class CatalogueComponent
{
    public void add( CatalogueComponent catalogueComponent )
    {
        throw new UnsupportedOperationException( "add Not implemented yet!" );
    }

    public void remove( CatalogueComponent catalogueComponent )
    {
        throw new UnsupportedOperationException( "remove Not implemented yet!" );
    }

    public void update( CatalogueComponent catalogueComponent )
    {
        throw new UnsupportedOperationException( "update Not implemented yet!" );
    }

    public String getName( CatalogueComponent catalogueComponent )
    {
        throw new UnsupportedOperationException( "getName Not implemented yet!" );
    }

    public double getPrice( CatalogueComponent catalogueComponent )
    {
        throw new UnsupportedOperationException( " getPrice Not implemented yet!" );
    }

    public void print()
    {
        throw new UnsupportedOperationException( " print Not implemented yet!" );
    }
}
