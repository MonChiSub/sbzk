//package selenium;
//
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import org.junit.jupiter.api.DisplayName;
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.HashMap;
//import java.util.Map;
//
//public class SeleniumMainTests {
//
//    private WebDriver driver;
//    private Map<String, Object> vars;
//    JavascriptExecutor js;
//
//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\patri\\documents\\chromedriver.exe");
//        driver = new ChromeDriver();
//        js = (JavascriptExecutor) driver;
//        vars = new HashMap<String, Object>();
//    }
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
//
//    @Test
//    @DisplayName("Adding Monkey Test")
//    public void addMonkey() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("pNameMonkey")).click();
//        driver.findElement(By.id("pNameMonkey")).sendKeys("testNameMonkey");
//        driver.findElement(By.id("pBreedMonkey")).sendKeys("testBreedMonkey");
//        driver.findElement(By.id("pIsHungryMonkey")).sendKeys("true");
//        driver.findElement(By.cssSelector("#addingAMonkey > button")).click();
//        driver.navigate().back();
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
//        driver.navigate().back();
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
//        driver.navigate().back();
//    }
//
//    @Test
//    @DisplayName("View Zoo")
//    public void viewZoo() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("viewZoo")).click();
//        driver.navigate().back();
//    }
//
//    @Test
//    @DisplayName("View Monkeys")
//    public void viewMonkeys() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#monkeyGetTestYoHaHaHaHa > button")).click();
//        driver.navigate().back();
//    }
//
//    @Test
//    @DisplayName("View Owls")
//    public void viewOwls() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#owlGetTestYoHaHaHaHa > button")).click();
//        driver.navigate().back();
//    }
//
//    @Test
//    @DisplayName("View Penguins")
//    public void viewPenguins() {
//        driver.get("http://localhost:8080");
//        driver.manage().window().maximize();
//        driver.findElement(By.cssSelector("#penguinGetTestYoHaHaHaHa > button")).click();
//        driver.navigate().back();
//    }
//}
