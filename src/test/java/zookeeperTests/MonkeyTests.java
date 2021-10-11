package zookeeperTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.softwareinstitute.zookeeper.Monkey;

class MonkeyTests {
    @Test
    @DisplayName("Testing of object string")
    void getObject() {
        Monkey testMonkey = new Monkey();
        assertEquals("{\"name\"=  \"Monke\", \"breed\"=\"Unknown Breed\", \"hungry\"=\"true\"}\n",
                testMonkey.toString(),
                "Object to string method is incorrect");
    }

    @Test
    @DisplayName("Test of Set & Get Name")
    void testGetName() {
        Monkey m = new Monkey("Monke", "Baboon");
        m.setName("Bobby");
        assertEquals("Bobby",
                m.getName(),
                "Incorrect name return");
    }

    @Test
    @DisplayName("Test of Set & Get Breed")
    void testSetGetBreed() {
        Monkey m = new Monkey("Monke", "Tamarin", true);
        m.setBreed("Testing");
        assertEquals("testing",
                m.getBreed().toLowerCase(),
                "Breed returned incorrectly.");
    }

    @Test
    @DisplayName("Test of Set and Get Hungry")
    void testSetGetIsHungry() {
        Monkey m = new Monkey("Monke", "Capuchin", true);
        m.setIsHungry(false);
        assertEquals(false,
                m.getIsHungry(),
                "Hungry boolean returned incorrectly.");
    }

    @Test
    @DisplayName("Test of eat")
    void testEat() {
        Monkey m = new Monkey("Monke", "Capuchin", true);
        assertEquals("is hungry and eats a banana",
                m.eat(),
                "Eat method did not return as hungry, or was returned incorrectly.");

        Monkey c = new Monkey("Monke", "Capuchin", false);
        assertEquals("is not hungry to eat",
                c.eat(),
                "Eat method did not return as not hungry, or was returned incorrectly.");
    }

    @Test
    @DisplayName("Test of die")
    void testDie() {
        Monkey testMonkey = new Monkey();
        assertEquals("i have died.",
                testMonkey.die(),
                "Die method returned incorrectly.");
    }

    @Test
    @DisplayName("Testing of reproduce")
    void testReproduce() {
        Monkey testMonkey = new Monkey();
        assertEquals("Perform a live birth",
                testMonkey.reproduce(),
                "Reproduce returned incorrectly.");
    }

    @Test
    @DisplayName("Testing of breathe")
    void testBreathe() {
        Monkey testMonkey = new Monkey();
        assertEquals("Inhale... Exhale...",
                testMonkey.breathe(),
                "Breathe method returned incorrectly.");
    }

    @Test
    @DisplayName("Test of sleep")
    void testSleep() {
        Monkey testMonkey = new Monkey();
        assertEquals("i have fallen asleep",
                testMonkey.sleep(),
                "Sleep method returned incorrectly.");
    }
}
