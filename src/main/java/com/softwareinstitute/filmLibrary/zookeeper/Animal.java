package com.softwareinstitute.filmLibrary.zookeeper;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
    //Variables

    //Constructor
    public Animal() {

    }

    //Methods
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