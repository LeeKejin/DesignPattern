package com.designpattern.singleton;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test
{
    public static void main( String[] args )
        throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
        InvocationTargetException, InstantiationException, NoSuchFieldException
    {
        //        Thread t1 = new Thread( new T() );
        //        Thread t2 = new Thread( new T() );
        //        t1.start();
        //        t2.start();

        //Anti-Serializable
        /*HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream( "singleton_file" ) );
        oos.writeObject( hungrySingleton );

        File file = new File( "singleton_file" );
        ObjectInputStream ois = new ObjectInputStream( new FileInputStream( file ) );
        HungrySingleton newInstance = ( HungrySingleton ) ois.readObject();
        System.out.println( hungrySingleton );
        System.out.println( newInstance );
        System.out.println( hungrySingleton == newInstance );*/

        //        Class objectClass = HungrySingleton.class;
        //        Constructor constructor = objectClass.getDeclaredConstructor();
        //        constructor.setAccessible( true ); //Change the private access!!!!! Then multiple instances can be created
        //        HungrySingleton hungrySingleton = HungrySingleton.getInstance();
        //        HungrySingleton newInstance = ( HungrySingleton ) constructor.newInstance();
        //        System.out.println( hungrySingleton );
        //        System.out.println( newInstance );
        //        System.out.println( hungrySingleton == newInstance );
        LazySingleton lazySingleton = LazySingleton.getInstance();

        Class objectClass = LazySingleton.class;
        Constructor constructor = objectClass.getDeclaredConstructor();
        constructor.setAccessible( true );
        Field field = objectClass.getDeclaredField( "flag" );
        LazySingleton newInstance = ( LazySingleton ) constructor.newInstance();

        field.setAccessible( true );
        field.setBoolean( newInstance, true );

        System.out.println( newInstance );
        System.out.println( lazySingleton );
        System.out.println( newInstance == lazySingleton );

    }
}
