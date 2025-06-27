package org.example;


public class Calculator
{
    public int add(int a,int b){
        return a+b;
    }

    public int multiply(int a,int b){
        return a*b;
    }

    public boolean isPositive(int number){
        return number>0;
    }
    public static void main( String[] args )
    {

        System.out.println( "This is a simple calculator app" );
    }
}
