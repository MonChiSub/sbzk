package controllerTests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.softwareinstitute.controller.TempController;

public class TempControllerTests {

    TempController tempControllerTest = new TempController();

    @Test
    @DisplayName("Testing getGreetings method")
    void getGreetings() {
        assertEquals("Hi, this is a test",
                tempControllerTest.getGreeting(),
                "Returned string incorrectly.");
    }
}
