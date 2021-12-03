package com.softwareinstitute.zookeeper;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Animal {
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int animalID;

    public Animal() {
        animalID = count.getAndIncrement();
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

    public int getUniqueID() {
        return animalID;
    }
}
