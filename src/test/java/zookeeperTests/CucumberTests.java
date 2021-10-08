package zookeeperTests;

import com.softwareinstitute.zookeeper.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucumberTests {

    /** MONKEY IS HUNGRY STORY
     *  Cucumber testing section
     */
    public Monkey testMonkey = new Monkey();
    public Owl testOwl = new Owl();
    public Penguin testPenguin = new Penguin();
    
    @Given("monkey hungry is {string}")
    public void isMonkeyHungry(String pIsHungry) {
        boolean stringToBoolean = Boolean.parseBoolean(pIsHungry);
        testMonkey.setIsHungry(stringToBoolean);
    }

    @When("monkey is hungry")
    public void monkeyGivenFood() {
        testMonkey.getIsHungry();
    }

    @Then("monkey {string}")
    public void doesMonkeyEat(String expectedAnswer) {
        assertEquals(expectedAnswer, testMonkey.eat());
    }

    /** OWL CAN FLY STORY
     *  Cucumber testing section
     */
    @Given("owl can fly is {string}")
    public void canOwlFly(String pCanFly) {
        boolean stringToBoolean = Boolean.parseBoolean(pCanFly);
        testOwl.setCanFly(stringToBoolean);
    }

    @When("owl energy is {int}")
    public void owlWantsToFly(int pEnergy) {
        testOwl.setFlyEnergy(pEnergy);
    }

    @Then("owl will {string}")
    public void owlWillFly(String doesOwlActuallyFly) {
        assertEquals(doesOwlActuallyFly, testOwl.fly());
    }

    /** PENGUIN IS HUNGRY STORY
     *  Cucumber testing section
     */
    @Given("penguin is aged {int}")
    public void penguinOverAgeSquawk(int pAge) {
        testPenguin.setAge(pAge);
    }

    @When("the penguin wants to squawk")
    public void penguinWhenSquawk() {
        testPenguin.getAge();
    }

    @Then("penguin will {string}")
    public void penguinSquawk(String doesPenguinSquawkLoud) {
        assertEquals(doesPenguinSquawkLoud, testPenguin.squawk());
    }
}
