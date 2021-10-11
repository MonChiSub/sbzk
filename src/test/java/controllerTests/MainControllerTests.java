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
        assertEquals(mainControllerTest.getZoo(),
                mainControllerTest.getZoo(),
                "Returned the whole zoo incorrectly.");
    }

    @Test
    @DisplayName("Get monkeys test")
    void getAddMonkey() {
        mainControllerTest.addMonkey("addMonkeyTestName","addMonkeyTestBreed","true");
        assertEquals( "[{\"name\":\"Bobo\",\"breed\":\"Capuchin\",\"isHungry\":false}," +
                        "{\"name\":\"Zeniox\",\"breed\":\"Bonbo\",\"isHungry\":true}," +
                        "{\"name\":\"addMonkeyTestName\",\"breed\":\"addMonkeyTestBreed\",\"isHungry\":true}]",
                mainControllerTest.getMonkey(),
                "Returned monkeys incorrectly.");
    }

    @Test
    @DisplayName("Get Owls Test")
    void GetAddOwl() {
        mainControllerTest.addOwl("addOwlTestName","addOwlTestBreed");
        assertEquals(true,
                mainControllerTest.getOwl().contains("Twit") && mainControllerTest.getOwl().contains("Little Owl")
                        &&
                        mainControllerTest.getOwl().contains("addOwlTestName") && mainControllerTest.getOwl().contains("addOwlTestBreed"),
                "Returned owls incorrectly.");
    }

    @Test
    @DisplayName("Get penguins test")
    void GetAddPenguin() {
        mainControllerTest.addPenguin("addPenguinTestName","addPenguinTestBreed","4");
        assertEquals("[{\"name\":\"Pingu\",\"breed\":\"Fairy Penguin\",\"age\":2}," +
                        "{\"name\":\"addPenguinTestName\",\"breed\":\"addPenguinTestBreed\",\"age\":4}]",
                mainControllerTest.getPenguin(),
                "Returned penguins incorreclty");
    }


}
