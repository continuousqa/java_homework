package com.com.inheritence;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private int blah;
    private String coat;

    // Control + N Generate Constructor:
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // super calls parent class, here setting values.
        this.eyes = eyes;  // this is setting values within this class.
        this.legs = legs;  // this.[param] param is defined field within this class, not the method params.
        this.tail = tail;  // this constructor sets the class field to be the value passed into the method.
        this.teeth = teeth;
        this.coat = coat;
        // The above takes some fields from the base class (animal) and adds it's own, via a constructor
    }

    // static and instance methods: if you are using fields, go with instance; otherwiwse static.

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

}
