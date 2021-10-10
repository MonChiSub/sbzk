package com.softwareinstitute.controller;

import com.google.gson.Gson;
import com.softwareinstitute.zookeeper.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.ArrayList;

@RestController
public class MainController {

    Zoo zoo = new Zoo();

    //RequestMapping(path = "/createZoo", method = RequestMethod.GET)
    @GetMapping("/getZoo")
    public String getZoo() {
        return zoo.toString();
    }

    @GetMapping("/monkeySelect")
    public String getMonkey() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        List<Animal> newListOfAnimals = new ArrayList<>();
        for (Animal a : listOfAnimals) {
            if (a.getClass().getName().contains("Monkey")) {
                newListOfAnimals.add(a);
            }
        }
        return new Gson().toJson(newListOfAnimals);
    }

    @GetMapping("/owlSelect")
    public String getOwl() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        List<Animal> newListOfAnimals = new ArrayList<>();
        for (Animal a : listOfAnimals) {
            if (a.getClass().getName().contains("Owl")) {
                newListOfAnimals.add(a);
            }
        }
        return new Gson().toJson(newListOfAnimals);
    }

    @GetMapping("/penguinSelect")
    public String getPenguin() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        List<Animal> newListOfAnimals = new ArrayList<>();
        for (Animal a : listOfAnimals) {
            if (a.getClass().getName().contains("Penguin")) {
                newListOfAnimals.add(a);
            }
        }
        return new Gson().toJson(newListOfAnimals);
    }

    @PostMapping("/addMonkey")
    public String addMonkey(String pName, String pBreed, String pIsHungry) {
        List<Animal> animals = zoo.getListOfAnimals();
        if(pName.isEmpty()) {
            pName = "Harambe";
        }
        if(pBreed.isEmpty()) {
            pBreed = "Bonbo";
        }
        if (pIsHungry.isEmpty()) {
            pIsHungry = "true";
        }
        boolean isHungryBoolean = Boolean.parseBoolean(pIsHungry);
        Monkey newMonkey = new Monkey(pName, pBreed, isHungryBoolean);
        animals.add(newMonkey);
        return "The following monkey has been added to the zoo: \n" + newMonkey.toString();
    }

    @PostMapping("/addOwl")
    public String addOwl(String pName, String pBreed) {
        List<Animal> animals = zoo.getListOfAnimals();
        if(pName.isEmpty()) {
            pName = "Twit";
        }
        if(pBreed.isEmpty()) {
            pBreed = "Little Owl";
        }
        Owl newOwl = new Owl(pName, pBreed);
        animals.add(newOwl);
        return "The following owl has been added to the zoo: \n" + newOwl.toString();
    }

    @PostMapping("/addPenguin")
    public String addPenguin(String pName, String pBreed, String pAge) {
        List<Animal> animals = zoo.getListOfAnimals();
        if(pName.isEmpty()) {
            pName = "Pingu";
        }
        if(pBreed.isEmpty()) {
            pBreed = "Fairy Penguin";
        }
        if(pAge.isEmpty()) {
            pAge = "0";
        }
        int ageOfPenguin = Integer.parseInt(pAge);
        Penguin newPenguin = new Penguin(pName, pBreed, ageOfPenguin);
        animals.add(newPenguin);
        return "The following penguin has been added to the zoo: \n" + newPenguin.toString();
    }
}
