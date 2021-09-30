package zookeeper;

public class Penguin extends Bird {
    //Variables
    private String name;
    private String breed;
    private int age;

    //Constructors
    public Penguin() {
        this("Jeffo");
    }

    public Penguin(String pName) {
        this(pName, "Unknown");
    }

    public Penguin(String pName, String pBreed) {
        this(pName, pBreed, 0);
    }
    public Penguin(String pName, String pBreed, int pAge) {
        this.name = pName;
        this.breed = pBreed;
        this.age = pAge;
    }

    //Methods
    @Override
    public String eat() {
        if(age <= 12) {
            this.age += 1;
        }
        return this.name + " eats a fish";
    }

    public String squawk() {
        String squawk = "";
        if(age >= 3) {
            squawk = "SQUAWK!!!";
        } else {
            squawk = "squawk...";
        }
        return squawk;
    }
}