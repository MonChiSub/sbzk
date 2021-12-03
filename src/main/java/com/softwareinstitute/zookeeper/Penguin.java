package com.softwareinstitute.zookeeper;

public class Penguin extends Bird {
    //Variables
    private String name;
    private String breed;
    private int age;
    private String animalType;

    //Constructors
    public Penguin() {
        this("Pingu");
    }

    public Penguin(String pName) {
        this(pName, "Unknown Breed");
    }

    public Penguin(String pName, String pBreed) {
        this(pName, pBreed, 0);
    }

    public Penguin(String pName, String pBreed, int pAge) {
        this.name = pName;
        this.breed = pBreed;
        this.age = pAge;
        this.animalType = "Penguin";
    }

    //Methods
    public String toString() {
        return "{" + "\"name\"=  \"" + this.name + "\", \"breed\"=\"" + this.breed +
                "\", \"age of penguin\"=\"" + this.age + "\"}\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getAnimalType() {
        return animalType;
    }

    @Override
    public String eat() {
        if (age <= 12) {
            this.age += 1;
        }
        return this.name + " eats a fish";
    }

    public String squawk() {
        String squawk = "";
        if (age >= 3) {
            squawk = "SQUAWK!!!";
        } else {
            squawk = "squawk...";
        }
        return squawk;
    }
}
