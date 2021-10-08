package com.softwareinstitute.zookeeper;

public class Monkey extends Mammal {

    private String name;
    private String breed;
    private boolean isHungry;

    public Monkey() {
        this("Monke");
    }

    public Monkey(String pName) {
        this(pName, "Unknown Breed");
    }

    public Monkey(String pName, String pBreed) {
        this(pName, pBreed, true);
    }

    public Monkey(String pName, String pBreed, boolean hungry) {
        this.name = pName;
        this.breed = pBreed;
        this.isHungry = hungry;
    }

    public String toString() {
        return "{" + "\"name\"=  \"" + this.name + "\", \"breed\"=\"" + this.breed +
                "\", \"hungry\"=\"" + this.isHungry + "\"}\n";
    }

    public void setName(String pName) {
        this.name = pName;
    }

    public String getName() {
        return name;
    }

    public void setBreed(String pBreed) {
        this.breed = pBreed;
    }

    public String getBreed() {
        return breed;
    }

    public boolean getIsHungry() {
        return isHungry;
    }

    public void setIsHungry(boolean pIsHungry) {
        this.isHungry = pIsHungry;
    }

    public String eat() {
        if (this.isHungry) {
            return "is hungry and eats a banana";
        } else {
            return "is not hungry to eat";
        }
    }
}