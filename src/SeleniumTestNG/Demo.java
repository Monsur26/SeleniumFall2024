package SeleniumTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class Demo {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
/*        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=true");
        driver = new EdgeDriver(options);*/
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://monsur26.github.io/mypage/");

    }
    @Test (priority = 1)
    public void usernameTest(){
        WebElement usernameInputField =  driver.findElement(By.id("username"));
        usernameInputField.click();
        usernameInputField.sendKeys("Username");
    }
    @Test (priority = 2)
    public void passwordTest(){
        WebElement passwordInputField =  driver.findElement(By.id("password"));
        passwordInputField.click();
        passwordInputField.sendKeys("pass1");
    }
    @Test (priority = 3)
    public void usernameAndPasswordTest(){

        WebElement usernameInputField =  driver.findElement(By.id("username"));
        usernameInputField.click();
        usernameInputField.sendKeys("Username");
        WebElement passwordInputField =  driver.findElement(By.id("password"));
        passwordInputField.click();
        passwordInputField.sendKeys("pass1");
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        Assert.assertTrue(loginButton.isDisplayed());
        loginButton.click();

    }
    @Test (testName = "Search Bar test for rainforest website")
    public void searchBarTest(){
        WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        searchBar.click();
        searchBar.sendKeys("Great!");
    }
    @Test
    public void shopLinkTest(){
        WebElement shoplink = driver.findElement(By.linkText("Shop"));
        shoplink.click();
        String titleOfShopPage = driver.getTitle(); //Shop Links
        Assert.assertEquals(titleOfShopPage,"Shop","Test Failed");
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
