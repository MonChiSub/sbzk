package com.softwareinstitute.zookeeper;

public abstract class Animal {

    protected Animal() {

    }

    public abstract String getAnimalType();

    public abstract String getName();

    public abstract String breathe();

    public abstract String eat();

    public abstract String reproduce();

    public String sleep() {
        return "i have fallen asleep";
    }

    public String die() {
        return "i have died.";
    }
}
