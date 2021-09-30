package zookeeper;

public abstract class Animal {
    //Variables

    //Constructor

    //Methods
    public abstract String breathe();

    public abstract String eat();

    public abstract String reproduce();

    public String sleep() {
        //return Object.class.getName() + " has fallen asleep";
        return getClass().getName() + " has fallen asleep";
    }

    public String die() {
        return "The animal has died.";
    }
}
