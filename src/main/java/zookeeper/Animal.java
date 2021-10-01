package zookeeper;

public abstract class Animal {
    //Variables

    //Constructor

    //Methods
    public abstract String breathe();

    public abstract String eat();

    public abstract String reproduce();

    public String sleep() {
        return "i have fallen asleep";
    }

    public String die() {
        return "i have died.";
    }
}
