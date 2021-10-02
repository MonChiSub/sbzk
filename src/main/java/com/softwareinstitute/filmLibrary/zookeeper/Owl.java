package com.softwareinstitute.filmLibrary.zookeeper;

public class Owl extends Bird {
    //Variables
    private String name;
    private String breed;
    private int flyEnergy;
    private boolean canFly = false;

    public Owl() {
        this("Bert");
    }

    public Owl(String pName) {
        this(pName, "Unknown Breed");
    }

    public Owl (String pName, String pBreed) {
        int randomInt = (int)(100.0 * Math.random());
        this.flyEnergy = randomInt;
        this.name = pName;
        this.breed = pBreed;
        canFly();
    }

    public Owl (String pName, String pBreed, int pFlyEnergy) {
        this.name = pName;
        this.breed = pBreed;
        this.flyEnergy = pFlyEnergy;
        canFly();
    }

    //Methods
    public String toString() {
        return "{" + "\"name\"=  \"" + this.name + "\", \"breed\"=\"" + this.breed +
                "\", \"fly energy\"=\"" + this.flyEnergy + "\", \"canFly\"=\"" + this.canFly + "\"}\n";
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

    public int getFlyEnergy() {
        return flyEnergy;
    }

    public void setFlyEnergy(int flyEnergy) {
        this.flyEnergy = flyEnergy;
        canFly();
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean canFly() {
        if(getFlyEnergy() >= 75) {
            this.canFly = true;
        } else {
            this.canFly = false;
        }
        return canFly;
    }

    public String fly() {
        String canOwlFly = "";
        if(canFly) {
            canOwlFly = "Owl goes for a fly";
        } else {
            canOwlFly = "Owl cannot fly, energy too low.";
        }
        return canOwlFly;
    }

    public String eat() {
        if(flyEnergy <= 74) {
            flyEnergy += 5;
        }
        return this.name + " has eaten a worm.";
    }
}
