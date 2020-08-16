package com.designpattern.singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumTest
{
    public static void main( String[] args )
        throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
        InvocationTargetException, InstantiationException
    {
        //        EnumInstance enumInstance = EnumInstance.getInstance();
        //        ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( "enumSingleton_file" ) );
        //        oos.writeObject( enumInstance );
        //
        //        File file = new File( "enumSingleton_file" );
        //        ObjectInputStream ois = new ObjectInputStream( new FileInputStream( file ) );
        //        EnumInstance obj = ( EnumInstance ) ois.readObject();

        Class objClass = EnumInstance.class;
        Constructor constructor = objClass.getDeclaredConstructor( String.class, int.class );
        constructor.setAccessible( true );
        EnumInstance obj = ( EnumInstance ) constructor
            .newInstance( "Lee", 123 );//this line will throw 'Cannot reflectively create enum objects'

        EnumInstance enumInstance = EnumInstance.getInstance();

        System.out.println( enumInstance );
        System.out.println( obj );
        System.out.println( enumInstance == obj );

    }
}
