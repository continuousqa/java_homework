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

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
