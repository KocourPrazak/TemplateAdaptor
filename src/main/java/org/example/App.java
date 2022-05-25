package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(10, 22)); //.sum mistyping? Changed to .mult to demonstrate full functionality
        System.out.println(intsCalc.pow(2, 10));
    }
}
