package com.sdet;

public class WhileLoopExample {
    public static void main(String[] args){
        int count = 1;
        while (count != 6) {
            System.out.println("count value is " + count);
            count++;
        }
        for(int i=1; i<6; i++){
            System.out.println("Count value is " + i);
        }
    }
}
