package com.softwareinstitute.zookeeper;

public abstract class Bird extends Animal {

    @Override
    public String breathe(){
        return "Inhale... Exhale...";
    }

    @Override
    public String reproduce() {
        return "lay an egg";
    }
}
