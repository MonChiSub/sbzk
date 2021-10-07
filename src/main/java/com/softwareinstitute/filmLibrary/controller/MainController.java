package com.softwareinstitute.filmLibrary.controller;

import com.softwareinstitute.filmLibrary.zookeeper.Monkey;
import com.google.gson.Gson;
import com.softwareinstitute.filmLibrary.zookeeper.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController
public class MainController {

    Zoo zoo = new Zoo();

    @GetMapping("/createZoo")
    public String createZoo() {
        return zoo.toString();
    }

    @RequestMapping(path="/monkeySelect", method=RequestMethod.GET)
    public String getMonkey() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        List<Animal> newListOfAnimals = new ArrayList<>();
        for(Animal a : listOfAnimals) {
            if(a.getClass().equals("Monkey")) {
                newListOfAnimals.add(a);
            }
        }
        String json = new Gson().toJson(newListOfAnimals);
        return json;
    }

    @RequestMapping(path="/owlSelect", method=RequestMethod.GET)
    public String getOwl() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();

        Animal animalSelection;
        animalSelection = listOfAnimals.get(2);
        String json = new Gson().toJson(animalSelection);
        return json;
    }

    @RequestMapping(path="/penguinSelect", method=RequestMethod.GET)
    public String getPenguin() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        Animal animalSelection;
        animalSelection = listOfAnimals.get(3);
        String json = new Gson().toJson(animalSelection);
        return json;
    }

    @RequestMapping(path="/addMonkey", method=RequestMethod.POST)
    public String addMonkey(String pName, String pBreed, String pIsHungry) {
        List<Animal> animals = zoo.getListOfAnimals();
        boolean isHungryBoolean = Boolean.parseBoolean(pIsHungry);
        Monkey newMonkey = new Monkey(pName, pBreed, isHungryBoolean);
        animals.add(newMonkey);
        return newMonkey.toString();
    }

    @RequestMapping(path="/addOwl", method=RequestMethod.POST)
    public String addOwl(String pName, String pBreed) {
        List<Animal> animals = zoo.getListOfAnimals();
        Owl newOwl = new Owl(pName, pBreed);
        animals.add(newOwl);
        return newOwl.toString();
    }

    @RequestMapping(path="/addPenguin", method=RequestMethod.POST)
    public String addPenguin(String pName, String pBreed, String pAge) {
        List<Animal> animals = zoo.getListOfAnimals();
        int ageOfPenguin = Integer.parseInt(pAge);
        Penguin newPenguin = new Penguin(pName, pBreed, ageOfPenguin);
        animals.add(newPenguin);
        return newPenguin.toString();
    }
}
