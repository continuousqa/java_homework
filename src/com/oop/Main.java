package com.oop;

public class Main {
    public static void main(String[] args){
        Car honda = new Car();
        Car dodge = new Car();

        honda.setModel("Civic");
        System.out.println(honda.getModel());
    }
}
