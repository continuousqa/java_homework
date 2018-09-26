package com.com.Composition;
/**
 * Difference between Composition and Inheritence:
 * Inheretence can only inherit from one class at a time via the extends reference.
 * Composition can pull from many other classes.
 *
 * Inheritence is a "isA" relationship and Composition is a "hasA" relationship.
 * A Car "is a" vehicle...
 * A PC "has a" monitor, motherboard, case
 */
public class Main {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions (20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast","Acer",27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.getMonitor().drawPixelAt(1500,1200,"red");
        thePC.getMotherboard().loadProgram("itunes");
        thePC.getTheCase().pressPowerButton();
    }
}
