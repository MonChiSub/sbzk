package zookeeper;

import java.time.LocalDate;
import java.util.ArrayList;

public class Monkey extends Mammal {
    /** Class Variables Below
     *
     */
    private String name;
    private String breed;
    private LocalDate dateOfBirth;
    private ArrayList<String> medicalHistory = new ArrayList<>();
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
        this(pName, pBreed, LocalDate.now());
    }

    public Monkey(String pName, String pBreed, LocalDate dateOfBirth) {
        this(pName, pBreed, dateOfBirth, true);
    }

    public Monkey(String pName, String pBreed, int pYears) {
        this(pName, pBreed, pYears, true);
    }

    public Monkey(String pName, String pBreed, LocalDate dateOfBirth, boolean hungry) {
        this.name = pName;
        this.breed = pBreed;
        this.dateOfBirth = dateOfBirth;
        this.isHungry = hungry;
    }

    public Monkey(String pName, String pBreed, int pYears, boolean hungry) {
        this.name = pName;
        this.breed = pBreed;
        this.dateOfBirth = LocalDate.now().minusYears(pYears);
        this.isHungry = hungry;
    }

    /** Class Methods Below
     * @return name Returns the cat's name.
     */
    public String toString() {
        return this.name + " is a breed of " + this.breed + ". " + this.name + " was born on " + this.dateOfBirth + ". " + this.name + "'s hungry status is currently " + this.isHungry + ".";
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

    public void setDateOfBirth(LocalDate pDateOfBirth) {
        this.dateOfBirth = pDateOfBirth;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
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

    public void addMedicalNote(String pMedicalNote) {
        medicalHistory.add(pMedicalNote.toLowerCase());
    }

    public void removeMedicalNote(String pMessage) {
        medicalHistory.remove(pMessage.toLowerCase());
    }

    public String getMedicalRecord() {
        String medicalHistoryReturn = "";
        int i = 1;
        if (medicalHistory.isEmpty()) {
            medicalHistoryReturn = "No medical history found for " + this.name;
        }
        for (String medicalNote : medicalHistory) {
            medicalHistoryReturn += this.name + "'s" + " Medical Note " + i + ": " + medicalNote + "\n";
            i++;
        }
        return medicalHistoryReturn;
    }

    public String testMethod() {
        return "hello, this is a test.";
    }
}