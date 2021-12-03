package com.softwareinstitute.controller;

import com.google.gson.Gson;
import com.softwareinstitute.zookeeper.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;

@RestController
@CrossOrigin("http://localhost:3000")
public class MainController {

    Zoo zoo = new Zoo();

    @GetMapping("/getZoo")
    @CrossOrigin("http://localhost:3000/getZoo")
    public String getZoo() {
        return zoo.toString();
    }

    @GetMapping("/getMonkey")
    @CrossOrigin("http://localhost:3000/getMonkey")
    public String getMonkey() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        List<Animal> newListOfAnimals = new ArrayList<>();
        for (Animal a : listOfAnimals) {
            if (a.getAnimalType().equals("Monkey")) {
                newListOfAnimals.add(a);
            }
        }
        return new Gson().toJson(newListOfAnimals);
    }

    @GetMapping("/getOwl")
    @CrossOrigin("http://localhost:3000/getOwl")
    public String getOwl() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        List<Animal> newListOfAnimals = new ArrayList<>();
        for (Animal a : listOfAnimals) {
            if (a.getAnimalType().equals("Owl")) {
                newListOfAnimals.add(a);
            }
        }
        return new Gson().toJson(newListOfAnimals);
    }

    @GetMapping("/getPenguin")
    @CrossOrigin("http://localhost:3000/getPenguin")
    public String getPenguin() {
        List<Animal> listOfAnimals = zoo.getListOfAnimals();
        List<Animal> newListOfAnimals = new ArrayList<>();
        for (Animal a : listOfAnimals) {
            if (a.getAnimalType().equals("Penguin")) {
                newListOfAnimals.add(a);
            }
        }
        return new Gson().toJson(newListOfAnimals);
    }

    @CrossOrigin("http://localhost:3000")
    @PostMapping("/addMonkey")
    public ResponseEntity<Monkey> addMonkey(@RequestBody Monkey newMonkey) {
        List<Animal> animals = zoo.getListOfAnimals();
        Monkey addMonkey = new Monkey(newMonkey.getName(), newMonkey.getBreed(), newMonkey.getIsHungry());
        animals.add(addMonkey);
        return new ResponseEntity<Monkey>(addMonkey, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:3000")
    @PostMapping("/addOwl")
    public ResponseEntity<Owl> addOwl(@RequestBody Owl newOwl) {
        List<Animal> animals = zoo.getListOfAnimals();
        Owl addOwl = new Owl(newOwl.getName(), newOwl.getBreed());
        animals.add(addOwl);
        return new ResponseEntity<Owl>(addOwl, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:3000")
    @PostMapping("/addPenguin")
    public ResponseEntity<Penguin> addPenguin(@RequestBody Penguin newPenguin) {
        List<Animal> animals = zoo.getListOfAnimals();
        Penguin addPenguin = new Penguin(newPenguin.getName(), newPenguin.getBreed(), newPenguin.getAge());
        animals.add(addPenguin);
        return new ResponseEntity<Penguin>(addPenguin, HttpStatus.OK);
    }

    @CrossOrigin("http://localhost:3000")
    @DeleteMapping("/massRemoveAnimal/{pName}")
    public ResponseEntity massRemoveAnimal(@PathVariable String pName) {
        List<Animal> animals = zoo.getListOfAnimals();
        for(Animal e : animals) {
            animals.removeIf(animalItem -> animalItem.getName().equals(pName));
        }
        return ResponseEntity.ok().build();

//        for(int i = 0; i < animals.size(); i++) {
//            if(animals.get(i).getName().equals(pName)) {
//                animals.remove(i);
//            }
//        }

//        int indexNum = 0;
//        for(Animal e : animals) {
//            indexNum++;
//            if(e.getName().equals(pName)) {
//                animals.remove(indexNum);
//            }
//        }

//        for(Animal e : animals) {
//            if(e.getName().equals(pName)) {
//                animals.remove(e);
//            }
//        }
    }

    @CrossOrigin("http://localhost:3000")
    @DeleteMapping("/removeAnimal/{pName}")
    public ResponseEntity removeAnimal(@PathVariable String pName) {
        List<Animal> animals = zoo.getListOfAnimals();
        animals.removeIf(animalItem -> animalItem.getName().equals(pName));
        return ResponseEntity.ok().build();
    }
}