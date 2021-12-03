package selenium;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumMainTests {
//
//    private WebDriver driver;
//
//    @Before
//    public void setUp() {
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setHeadless(true);
//        driver = new ChromeDriver(chromeOptions);
//    }
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Test
//    @DisplayName("Adding Monkey Test")
//    public void addMonkey() throws InterruptedException {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        Thread.sleep(500);
//        driver.findElement(By.id("pNameMonkey")).click();
//        driver.findElement(By.id("pNameMonkey")).sendKeys("testNameMonkey");
//        driver.findElement(By.id("pBreedMonkey")).sendKeys("testBreedMonkey");
//        driver.findElement(By.id("pIsHungryMonkey")).sendKeys("true");
//        driver.findElement(By.cssSelector("#addingAMonkey > button")).click();
//        Thread.sleep(500);
//        WebElement monkeyReturn = driver.findElement(By.xpath("/html/body/text()"));
//        String monkeyReturnString = monkeyReturn.getText();
//        assertEquals("The following monkey has been added to the zoo: " +
//                "{\"name\"=  \"testNameMonkey\", \"breed\"=\"testBreedMonkey\", \"hungry\"=\"true\"}",
//                monkeyReturnString,
//                "The return statement is incorrect.");
//    }
//
//    @Test
//    @DisplayName("Adding Owl Test")
//    public void addOwl() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("pNameOwl")).click();
//        driver.findElement(By.id("pNameOwl")).sendKeys("testOwlName");
//        driver.findElement(By.id("pBreedOwl")).sendKeys("testOwlBreed");
//        driver.findElement(By.cssSelector("#addingAOwl > button")).click();
//    }
//
//    @Test
//    @DisplayName("Adding Penguin Test")
//    public void addPenguin() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("pNamePenguin")).click();
//        driver.findElement(By.id("pNamePenguin")).sendKeys("testPenguinName");
//        driver.findElement(By.id("pBreedPenguin")).sendKeys("testPenguinBreed");
//        driver.findElement(By.id("pAgePenguin")).sendKeys("0");
//        driver.findElement(By.cssSelector("#addingAPenguin > button")).click();
//    }
//
//    @Test
//    @DisplayName("View Zoo")
//    public void viewZoo() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("viewZoo")).click();
//    }
//
//    @Test
//    @DisplayName("View Monkeys")
//    public void viewMonkeys() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#monkeyGetTestYoHaHaHaHa > button")).click();
//    }
//
//    @Test
//    @DisplayName("View Owls")
//    public void viewOwls() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#owlGetTestYoHaHaHaHa > button")).click();
//    }
//
//    @Test
//    @DisplayName("View Penguins")
//    public void viewPenguins() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#penguinGetTestYoHaHaHaHa > button")).click();
//    }
}