package zookeeperTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.softwareinstitute.zookeeper.Penguin;

public class PenguinTests {

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
        assertEquals("Jeffo eats a fish", testPenguin.eat(), "String return was incorrect");
        assertEquals(1, testPenguin.getAge(), "Penguin returned with the wrong age");
    }

    @Test
    @DisplayName("Testing the toString method of penguin")
    void testToString() {
        Penguin testPenguin = new Penguin();
        assertEquals("{\"name\"=  \"Jeffo\", \"breed\"=\"Unknown\", \"date of birth\"=\"0\"}", testPenguin.toString());
    }
}
