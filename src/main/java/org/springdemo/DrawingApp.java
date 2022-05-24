package org.springdemo;

import org.bean.Triangle;

/**
 * Hello world!
 *
 */
public class DrawingApp
{
    public static void main( String[] args )
    {
        Triangle triangle=new Triangle();
        triangle.draw();
        System.out.println( "Hello World!" );
    }
}
