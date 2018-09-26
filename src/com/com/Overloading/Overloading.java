package com.com.Overloading;

public class Overloading {

    public static void main(String[] args){
        System.out.println(calcFeetAndInchestoCentimeters(7, 5));
        System.out.println(calcFeetAndInchestoCentimeters(55));

    }

    public static double calcFeetAndInchestoCentimeters(int feet, int inches){
        if(feet >=0 || (inches >= 0 && inches <=12)){
            int calcInches = feet * 12;
            int totalInches = calcInches + inches;
            return totalInches * 2.54;
        }else{
            return -1;
        }
    };

    public static double calcFeetAndInchestoCentimeters(int inches){
        return inches * 2.54;
    };
}
