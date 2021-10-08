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
    @GetMapping("/createZoo")
    public String createZoo() {
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
        String json = new Gson().toJson(newListOfAnimals);
        return json;
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
        String json = new Gson().toJson(newListOfAnimals);
        return json;
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
        String json = new Gson().toJson(newListOfAnimals);
        return json;
    }

    @PostMapping("/addMonkey")
    public String addMonkey(String pName, String pBreed, String pIsHungry) {
        List<Animal> animals = zoo.getListOfAnimals();
        boolean isHungryBoolean = Boolean.parseBoolean(pIsHungry);
        Monkey newMonkey = new Monkey(pName, pBreed, isHungryBoolean);
        animals.add(newMonkey);
        return newMonkey.toString();
    }

    @PostMapping("/addOwl")
    public String addOwl(String pName, String pBreed) {
        List<Animal> animals = zoo.getListOfAnimals();
        Owl newOwl = new Owl(pName, pBreed);
        animals.add(newOwl);
        return newOwl.toString();
    }

    @PostMapping("/addPenguin")
    public String addPenguin(String pName, String pBreed, String pAge) {
        List<Animal> animals = zoo.getListOfAnimals();
        int ageOfPenguin = Integer.parseInt(pAge);
        Penguin newPenguin = new Penguin(pName, pBreed, ageOfPenguin);
        animals.add(newPenguin);
        return newPenguin.toString();
    }
}
