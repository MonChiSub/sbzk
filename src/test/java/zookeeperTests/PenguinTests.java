package zookeeperTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import zookeeper.Penguin;

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
}
