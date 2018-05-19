package com.sdet;

/**
 * This is an example lesson on using method overloading,
 * as well as constants.
 */

public class AreaCalculator {

    private static final double PI = 3.14159;

    public static void main(String args[]){
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }
        return radius * radius * PI;
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1.0;
        }
        return x * y;
    }
}
