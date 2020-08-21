package com.designpattern.composite;

public class Test
{
    public static void main( String[] args )
    {
        CatalogueComponent linuxCourse = new Course( "Linux course", 100 );
        CatalogueComponent windowCourse = new Course( "Window course", 200 );

        CatalogueComponent languageCourseCatalogue = new CourseCatalogue( "Language Course Catalogue", 2 );
        Course java = new Course( "Java", 59 );
        Course c = new Course( "C", 88 );
        Course cPlusPlus = new Course( "C++", 20 );
        languageCourseCatalogue.add( java );
        languageCourseCatalogue.add( c );
        languageCourseCatalogue.add( cPlusPlus );

        CatalogueComponent mainCourseCatalogue = new CourseCatalogue( "E-learning catalogue", 1 );
        mainCourseCatalogue.add( linuxCourse );
        mainCourseCatalogue.add( windowCourse );
        mainCourseCatalogue.add( languageCourseCatalogue );

        mainCourseCatalogue.print();

    }
}
