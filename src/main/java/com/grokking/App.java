package com.grokking;

/**
 * Hello world!
 *
 */
public class App 
{

    static void decreasingFunctionCount(int n) {
        if (n > 0) {
            //for(int i = 0; i < n; i++)
           // {
                System.out.println("Print" + n);
           // }
            decreasingFunctionCount(n - 1);
        }
    }
    public static void main( String[] args )
    {
        System.out.println("Hello World!");
        
        App.decreasingFunctionCount(7);
    }
}
