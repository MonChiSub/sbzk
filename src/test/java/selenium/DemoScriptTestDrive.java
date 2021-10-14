package selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScriptTestDrive {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\patri\\documents\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://phptravels.com/demo/");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Getting attributes test")
    public void getAttributesTest() {
        //Fetching the image source
        WebElement image = driver.findElement(By.xpath("//img[@class=\"scr center-block img-responsive\"]"));
        System.out.println("The image source is : " + image.getAttribute("src"));

        //Fetching the placeholder value
        WebElement emailField = driver.findElement(By.id("address"));
        String placeholderVal = emailField.getAttribute("placeholder");
        String expectedVal = "your@email.com";
        if (placeholderVal.equalsIgnoreCase(expectedVal)) {
            System.out.println("The placeholder value: \"" + placeholderVal + "\" matches with the expected value: \"" + expectedVal + "\".");
        } else {
            System.out.println("The placeholder value does not match: " + placeholderVal + " with expected value: " + expectedVal);
        }

        //Getting attribute value of an attribute that is not present on the page
        //WebElement logInBtn = driver.findElement(By.xpath("//*[@class=\"btn yx-nfn yx-njg\"]"));
        //System.out.println("The value of an attribute that doesn't exist is : " +logInBtn.getAttribute("type"));
    }
}
