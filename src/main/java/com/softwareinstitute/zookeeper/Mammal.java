package com.softwareinstitute.zookeeper;

public abstract class Mammal extends Animal {

    public String breathe() {
        return "Inhale... Exhale...";
    }

    @Override
    public String reproduce() {
        return "Perform a live birth";
    }
}
