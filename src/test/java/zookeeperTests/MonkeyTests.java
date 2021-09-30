package zookeeperTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import zookeeper.Monkey;

class MonkeyTests {
    @Test
    @DisplayName("Testing of object string")
    void getObject() {
        Monkey m = new Monkey("Monke", "Capuchin", 5, false);
        assertEquals("Monke is a breed of Capuchin. Monke was born on " + LocalDate.now().minusYears(5) + "." + " Monke's hungry status is currently false." , m.toString(), "Object to string method is incorrect");
        //this.name + " is a breed of " + this.breed + ". " + this.name + " was born on " + this.dateOfBirth + "." + this.name + "'s hungry status is: " + this.isHungry;
    }

    @Test
    @DisplayName("Test of Set & Get Name")
    void testGetName() {
        Monkey m = new Monkey("Monke", "Baboon", LocalDate.now());
        m.setName("Bobby");
        assertEquals("Bobby", m.getName(), "Incorrect name return");
    }

    @Test
    @DisplayName("Test of Add & Get Medical History")
    void testGetMedicalHistoryFish() {
        Monkey m = new Monkey();
        m.addMedicalNote("Allergic to fish");
        m.addMedicalNote("Testing");
        m.removeMedicalNote("Testing");
        assertEquals("Monke's Medical Note 1: allergic to fish\n", m.getMedicalRecord(), "Incorrect return of medical history");
    }

    @Test
    @DisplayName("Test of Get Medical History (If blank)")
    void testGetMedicalHistoryClear() {
        Monkey m = new Monkey("Monke", "Gorilla", 5);
        assertEquals("No medical history found for " + m.getName() , m.getMedicalRecord(),"Medical History return incorrect");
    }

    @Test
    @DisplayName("Test of Set & Get Breed")
    void testSetGetBreed() {
        Monkey m = new Monkey("Monke", "Tamarin", 5);
        m.setBreed("Testing");
        assertEquals("testing", m.getBreed().toLowerCase(), "Breed returned incorrectly.");
    }

    @Test
    @DisplayName("Test of Set & Get dateOfBirth")
    void testSetGetDateOfBirth() {
        Monkey m = new Monkey("Monke", "Marmoset", 5);
        m.setDateOfBirth(LocalDate.of(2013, 5, 5));
        assertEquals(LocalDate.of(2013, 5, 5), m.getDateOfBirth());
    }

    @Test
    @DisplayName("Test of Set and Get Hungry")
    void testSetGetIsHungry() {
        Monkey m = new Monkey("Monke", "Capuchin", 5);
        m.setIsHungry(false);
        assertEquals(false, m.getIsHungry(), "Hungry boolean returned incorrectly.");
    }

    @Test
    @DisplayName("Test of eat")
    void testEat() {
        Monkey m = new Monkey("Monke", "Capuchin", 5);
        assertEquals("is hungry and eats a banana", m.eat());
        Monkey c = new Monkey("Monke", "Capuchin", 5, false);
        assertEquals("is not hungry to eat", c.eat());
    }

    @Test
    @DisplayName("Test of test method")
    void testTest() {
        Monkey m = new Monkey("Monke", "Lion", 5);
        assertEquals("hello, this is a test.", m.testMethod());
    }
}
