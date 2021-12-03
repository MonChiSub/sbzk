package com.softwareinstitute.zookeeper;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> listOfAnimals = new ArrayList<>();

    public Zoo() {
        this.listOfAnimals.add(new Monkey("Bobo", "Capuchin", false));
        this.listOfAnimals.add(new Owl("Tweety", "Little Owl"));
        this.listOfAnimals.add(new Penguin("Pingu", "Fairy Penguin", 2));
    }

    public List<Animal> getListOfAnimals() {
        return this.listOfAnimals;
    }

    public String toString() {
        String json = new Gson().toJson(listOfAnimals);
        return json;
    }
}
