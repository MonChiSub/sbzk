package controllerTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.softwareinstitute.controller.MainController;

public class MainControllerTests {

    MainController mainControllerTest = new MainController();

    @Test
    @DisplayName("Get Zoo Test")
    void getZoo() {
        assertEquals(mainControllerTest.getZoo(),
                mainControllerTest.getZoo(),
                "Returned the whole zoo incorrectly.");
    }

    @Test
    @DisplayName("Get monkeys test")
    void getAddMonkey() {
        mainControllerTest.addMonkey("addMonkeyTestName","addMonkeyTestBreed","true");
        assertEquals(mainControllerTest.getMonkey().contains("addMonkeyTestName") &&
                mainControllerTest.getMonkey().contains("Bobo"),
                mainControllerTest.getMonkey().contains("addMonkeyTestName") &&
                mainControllerTest.getMonkey().contains("Bobo"),
                "Returned monkeys incorrectly.");
    }

    @Test
    @DisplayName("Get Owls Test")
    void GetAddOwl() {
        mainControllerTest.addOwl("addOwlTestName","addOwlTestBreed");
        assertEquals(mainControllerTest.getOwl().contains("addOwlTestName") &&
                mainControllerTest.getOwl().contains("Twit"),
                mainControllerTest.getOwl().contains("addOwlTestName") &&
                mainControllerTest.getOwl().contains("Twit"),
                "Returned owls incorrectly.");
    }

    @Test
    @DisplayName("Get penguins test")
    void GetAddPenguin() {
        mainControllerTest.addPenguin("addPenguinTestName","addPenguinTestBreed","4");
        assertEquals(mainControllerTest.getPenguin().contains("addPenguinTestName") &&
                mainControllerTest.getPenguin().contains("Pingu"),
                mainControllerTest.getPenguin().contains("addPenguinTestName") &&
                mainControllerTest.getPenguin().contains("Pingu"),
                "Returned penguins incorreclty");
    }


}
