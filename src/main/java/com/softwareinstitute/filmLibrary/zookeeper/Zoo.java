package com.softwareinstitute.filmLibrary.zookeeper;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class Zoo {
    private List<Animal> listOfAnimals = new ArrayList<>();
    private List<Animal> monkeyList = new ArrayList<>();

    public Zoo() {
        this.listOfAnimals.add(new Monkey("Bobo", "Capuchin", true));
        this.listOfAnimals.add(new Monkey("Jeffemery", "Orangutan", false));
        this.listOfAnimals.add(new Owl("Bert","Little Owl"));
        this.listOfAnimals.add(new Penguin("Blizzard", "Fairy Penguin", 2));
    }

    public List<Animal> getListOfAnimals() {
        return this.listOfAnimals;
    }

    public String toString() {
        String json = new Gson().toJson(listOfAnimals);
        return json;
    }

}
