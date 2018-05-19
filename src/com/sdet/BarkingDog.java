package com.sdet;

public class BarkingDog {

    public static void main(String[] args){
        System.out.println(bark(true, 8));
    }

    public static boolean bark(boolean barking, int hourOfDay){
        if(hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        if(barking == true && hourOfDay < 8 || barking == true && hourOfDay > 22){
            return true;
        }
        return false;
    }
}
