package controllerTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.softwareinstitute.controller.MainController;

class MainControllerTests {

    MainController mainControllerTest = new MainController();

    @Test
    @DisplayName("Get Zoo Test")
    void getZoo() {
        assertEquals(true,
                mainControllerTest.getZoo().contains("[{\"name\":\"Bobo\",\"breed\":\"Capuchin\",\"isHungry\":false},")
                        && mainControllerTest.getZoo().contains("{\"name\":\"Zeniox\",\"breed\":\"Bonbo\",\"isHungry\":true},")
                        && mainControllerTest.getZoo().contains("{\"name\":\"Tweety\",\"breed\":\"Little Owl\",\"flyEnergy\":")
                        && mainControllerTest.getZoo().contains(",\"canFly\":")
                        && mainControllerTest.getZoo().contains("{\"name\":\"Pingu\",\"breed\":\"Fairy Penguin\",\"age\":2}]"),
                "Returned the whole zoo incorrectly.");
    }

    @Test
    @DisplayName("Get monkeys test")
    void getAddMonkey() {
        mainControllerTest.addMonkey("addMonkeyTestName","addMonkeyTestBreed","true");
        mainControllerTest.addMonkey("","","");
        assertEquals( "[{\"name\":\"Bobo\",\"breed\":\"Capuchin\",\"isHungry\":false}," +
                        "{\"name\":\"Zeniox\",\"breed\":\"Bonbo\",\"isHungry\":true}," +
                        "{\"name\":\"addMonkeyTestName\",\"breed\":\"addMonkeyTestBreed\",\"isHungry\":true}," +
                        "{\"name\":\"Harambe\",\"breed\":\"Bonbo\",\"isHungry\":true}]",
                mainControllerTest.getMonkey(),
                "Returned monkeys incorrectly.");
    }

    @Test
    @DisplayName("Get Owls Test")
    void GetAddOwl() {
        mainControllerTest.addOwl("addOwlTestName","addOwlTestBreed");
        mainControllerTest.addOwl("","");
        assertEquals(true,
                mainControllerTest.getOwl().contains("Tweety") && mainControllerTest.getOwl().contains("Little Owl")
                        &&
                        mainControllerTest.getOwl().contains("addOwlTestName") && mainControllerTest.getOwl().contains("addOwlTestBreed"),
                "Returned owls incorrectly.");
    }

    @Test
    @DisplayName("Get penguins test")
    void GetAddPenguin() {
        mainControllerTest.addPenguin("addPenguinTestName","addPenguinTestBreed","4");
        mainControllerTest.addPenguin("","","");
        assertEquals("[{\"name\":\"Pingu\",\"breed\":\"Fairy Penguin\",\"age\":2}," +
                        "{\"name\":\"addPenguinTestName\",\"breed\":\"addPenguinTestBreed\",\"age\":4}," +
                        "{\"name\":\"Pingu\",\"breed\":\"Fairy Penguin\",\"age\":0}]",
                mainControllerTest.getPenguin(),
                "Returned penguins incorreclty");
    }
}