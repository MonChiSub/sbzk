package zookeeperTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.softwareinstitute.zookeeper.Penguin;

class PenguinTests {

    @Test
    @DisplayName("Set and Get name test")
    void testSetGetName() {
        Penguin testPenguin = new Penguin();
        testPenguin.setName("Bobby");
        assertEquals("Bobby", testPenguin.getName());
    }

    @Test
    @DisplayName("Set and Get breed test")
    void testSetGetBreed() {
        Penguin testPenguin = new Penguin();
        testPenguin.setBreed("Unknown Breed aaaaa");
        assertEquals("Unknown Breed aaaaa", testPenguin.getBreed());
    }

    @Test
    @DisplayName("Test for penguin eat method")
    void testEat() {
        Penguin testPenguin = new Penguin();
        assertEquals("Pingu eats a fish", testPenguin.eat(), "String return was incorrect");
        assertEquals(1, testPenguin.getAge(), "Penguin returned with the wrong age");
        //Testing if statement with a false condition (was true for first two assertEqual tests).
        Penguin newTestPenguin = new Penguin("penguinName","Fairy Penguin",13);
        assertEquals(13, newTestPenguin.getAge(), "age returned incorrectly.");
        assertEquals("penguinName eats a fish", newTestPenguin.eat(), "String return was incorrect");
        assertEquals(13, newTestPenguin.getAge(), "Penguin aged from eating, it should not have.");
    }

    @Test
    @DisplayName("Testing the toString method of penguin")
    void testToString() {
        Penguin testPenguin = new Penguin("Pingo", "Fairo Penguino", 5);
        assertEquals("{\"name\"=  \"Pingo\", \"breed\"=\"Fairo Penguino\", \"age of penguin\"=\"5\"}\n", testPenguin.toString());
    }
}
