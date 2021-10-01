package zookeeperTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import zookeeper.Owl;

class OwlTests {

    @Test
    @DisplayName("Set & Get owl name tests")
    void testSetGetName() {
        Owl o = new Owl();
        o.setName("BirbOwl");
        assertEquals("BirbOwl", o.getName(), "Returned incorrect name.");
    }

    @Test
    @DisplayName("Set & Get owl breed tests")
    void testSetGetBreed() {
        Owl o = new Owl();
        o.setBreed("Snow Owl");
        assertEquals("Snow Owl", o.getBreed(), "Returned incorrect breed.");
    }

    @Test
    @DisplayName("Get owl canFly status")
    void testSetGetCanFly() {
        Owl o = new Owl();
        o.setCanFly(true);
        assertEquals(true, o.isCanFly());
    }

    @Test
    @DisplayName("Set & Get owl energy for flying")
    void testSetGetFlyEnergy() {
        Owl o = new Owl();
        o.setFlyEnergy(90);
        assertEquals(90, o.getFlyEnergy(), "Returned incorrect energy value");
        assertEquals(true, o.canFly(), "Returned incorrect boolean");
        assertEquals("Owl goes for a fly", o.fly(), "Can owl fly status returned wrong");
    }

    @Test
    @DisplayName("Owl eating test")
    void testOwlEat() {
        Owl testOwl = new Owl();
        testOwl.setFlyEnergy(74);
        assertEquals("Bert has eaten a worm.", testOwl.eat());
        assertEquals(79, testOwl.getFlyEnergy(), "Owl returned with wrong fly energy.");
    }
}
