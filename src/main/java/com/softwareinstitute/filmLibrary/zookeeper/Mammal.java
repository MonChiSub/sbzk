package com.softwareinstitute.filmLibrary.zookeeper;

public abstract class Mammal extends Animal {
    //Attributes


    //Constructor


    //Methods
    public String breathe(){
        return "Inhale... Exhale...";
    }

    @Override
    public String reproduce() {
        return "Perform a live birth";
    }
}
