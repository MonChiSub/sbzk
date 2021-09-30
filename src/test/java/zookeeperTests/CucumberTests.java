package zookeeperTests;

import zookeeper.Penguin;
import zookeeper.Owl;
import zookeeper.Monkey;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CucumberTests {

    /** MONKEY IS HUNGRY STORY
     *  Cucumber testing section
     */
    public Monkey testMonkey = new Monkey();

    @Given("monkey hungry is {string}")
    public void isMonkeyHungry(String pIsHungry) {
        boolean stringToBoolean = Boolean.parseBoolean(pIsHungry);
        testMonkey.setIsHungry(stringToBoolean);
    }

    @When("monkey is hungry")
    public void monkeyGivenFood() {
        boolean isMonkeyHungry = testMonkey.getIsHungry();
    }

    @Then("monkey {string}")
    public void doesMonkeyEat(String expectedAnswer) {
        assertEquals(expectedAnswer, testMonkey.eat());
    }

    /** OWL CAN FLY STORY
     *  Cucumber testing section
     */
    private String canFly;
    private String doesOwlFlyResult;

    @Given("owl can fly is {string}")
    public void canOwlFly(String pCanFly) {
        canFly = pCanFly;
    }

    @When("owl wants to fly")
    public void owlWantsToFly() {
        doesOwlFlyResult = TestMethods.canOwlFly(canFly);
    }

    @Then("owl will {string}")
    public void owlWillFly(String doesOwlActuallyFly) {
        assertEquals(doesOwlActuallyFly, doesOwlFlyResult);
    }

    //Penguin squawk story
    private int age;
    private String canSquawkLoud;
    @Given("penguin is aged {int}")
    public void penguinOverAgeSquawk(int pAge) {
        age = pAge;
    }

    @When("the penguin wants to squawk")
    public void penguinWhenSquawk() {
        canSquawkLoud = TestMethods.canSquawk(age);
    }

    @Then("penguin will {string}")
    public void penguinSquawk(String doesPenguinSquawkLoud) {
        assertEquals(doesPenguinSquawkLoud, canSquawkLoud);
    }


    /**
     * Test method class for cucumber tests
     * New class implementation for a static class
     */
    static class TestMethods {
        static String canOwlFly(String canFly) {
            String fly = "";
            if (canFly.equals("true")) {
                fly = "fly";
            } else if (canFly.equals("false")) {
                fly = "not fly";
            }
            return fly;
        }

        static String canSquawk(int pAge) {
            String canSquawk;
            if(pAge >= 3) {
                canSquawk = "SQUAWK!!!";
            } else {
                canSquawk = "squawk...";
            }
            return canSquawk;
        }
    }
}
