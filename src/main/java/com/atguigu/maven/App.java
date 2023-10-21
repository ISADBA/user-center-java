package com.atguigu.maven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculate calculate = new Calculate();
        int addRes = calculate.add(3, 5);
        System.out.println("3 + 5 = " + addRes);
    }
}
