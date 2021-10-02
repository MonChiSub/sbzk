package com.softwareinstitute.filmLibrary.controller;

import com.google.gson.Gson;
import com.softwareinstitute.filmLibrary.zookeeper.*;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class MainController {

    Zoo zoo = new Zoo();

    @GetMapping("/createZoo")
    public String createZoo() {
        return zoo.toString();
    }

    @GetMapping("/monkeySelect")
    public String getMonkey() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        Animal animalSelection;
        animalSelection = listOfAnimals.get(0);
        Animal animalSelectionNew;
        animalSelectionNew = listOfAnimals.get(1);
        String json = new Gson().toJson(animalSelection);
        String jsonNew = new Gson().toJson(animalSelectionNew);
        String newJson = json + jsonNew;
        return newJson;
    }

    @GetMapping("/owlSelect")
    public String getOwl() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        Animal animalSelection;
        animalSelection = listOfAnimals.get(2);
        String json = new Gson().toJson(animalSelection);
        return json;
    }

    @GetMapping("/penguinSelect")
    public String getPenguin() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        Animal animalSelection;
        animalSelection = listOfAnimals.get(3);
        String json = new Gson().toJson(animalSelection);
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
        int ageOfCat = Integer.parseInt(pAge);
        Penguin newPenguin = new Penguin(pName, pBreed, ageOfCat);
        animals.add(newPenguin);
        return newPenguin.toString();
    }
}
