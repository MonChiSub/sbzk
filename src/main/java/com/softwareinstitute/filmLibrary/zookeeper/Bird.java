package com.softwareinstitute.filmLibrary.zookeeper;

public abstract class Bird extends Animal {
    //Methods
    public String breathe(){
        return "Inhale... Exhale...";
    }

    @Override
    public String reproduce() {
        return "lay an egg";
    }
}
