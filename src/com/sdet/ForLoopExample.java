package com.sdet;

public class ForLoopExample {
    public static void main(String args[]){
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
    }

    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        if(number % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if(end < start || end <= 0 || start <= 0){
            System.out.println("end is greater than start");
            return -1;
        }
        for (int i=start; i < end + 1; i++){
            if(isOdd(i) == true){
                sum = sum + i;
            }
        }
        return sum;
    }
}
