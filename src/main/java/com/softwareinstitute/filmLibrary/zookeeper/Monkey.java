package com.softwareinstitute.filmLibrary.zookeeper;

import java.time.LocalDate;
import java.util.ArrayList;

public class Monkey extends Mammal {
    /** Class Variables Below
     *
     */
    private String name;
    private String breed;
//    private ArrayList<String> medicalHistory = new ArrayList<>();
    private boolean isHungry;

    /** Class Constructor Below
     *
     */
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

    /** Class Methods Below
     * @return name Returns the monkey's details.
     */
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
        if(this.isHungry) {
            return "is hungry and eats a banana";
        } else {
            return "is not hungry to eat";
        }
    }

//    public void addMedicalNote(String pMedicalNote) {
//        medicalHistory.add(pMedicalNote.toLowerCase());
//    }
//
//    public void removeMedicalNote(String pMessage) {
//        medicalHistory.remove(pMessage.toLowerCase());
//    }
//
//    public String getMedicalRecord() {
//        String medicalHistoryReturn = "";
//        int i = 1;
//        if (medicalHistory.isEmpty()) {
//            medicalHistoryReturn = "No medical history found for " + this.name;
//        }
//        for (String medicalNote : medicalHistory) {
//            medicalHistoryReturn += this.name + "'s" + " Medical Note " + i + ": " + medicalNote + "\n";
//            i++;
//        }
//        return medicalHistoryReturn;
//    }
}