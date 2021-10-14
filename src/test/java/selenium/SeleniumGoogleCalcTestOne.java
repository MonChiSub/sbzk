package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGoogleCalcTestOne {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\patri\\documents\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=online+calculator&oq=online+calculator&aqs=chrome..69i57.2167j0j4&sourceid=chrome&ie=UTF-8");
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    @DisplayName("Getting attributes test")
    public void getAttributesTest() {
        driver.findElement(By.id("L2AGLb")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(3) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(3) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(3) .mF5fo > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(1) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(1) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) .mF5fo > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(3) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(2) .mF5fo > .XRsWPe")).click();
        driver.findElement(By.cssSelector("tr:nth-child(4) > td:nth-child(3) > .A2W7l > .XRsWPe")).click();
        driver.findElement(By.cssSelector(".UUhRt")).click();

        WebElement calcTotal = driver.findElement(By.id("cwos"));
        String actualValue = calcTotal.getText();
        String expectedValue = "53959";

        System.out.println("369 x 147 - 852 / 3");
        if(actualValue.equals(expectedValue)) {
            System.out.println("The actual value matched the expected value of: " + actualValue);
        } else {
            System.out.println("The actual value did not match the expected value of \"" + expectedValue + "\". The actual value was: \"" + actualValue + "\".");
        }
    }

}
