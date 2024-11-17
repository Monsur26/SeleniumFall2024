package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class BasicActions {
    public static void main(String[] args) throws InterruptedException {

        // System.setProperty("webdriver.msedge.driver", "C:\\Users\\Monsu\\Fall2024_Selenium\\Driver\\Edgebrowser\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://monsur26.github.io/mypage/");

        //WebElements
        WebElement usernameInputField =  driver.findElement(By.id("username"));
        WebElement passwordInputField =  driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Search...']"));

        //click() function will simulate mouse click
        usernameInputField.click();
        //sendKeys() function will allow typing on an input field
        usernameInputField.sendKeys("Username");
        usernameInputField.sendKeys(Keys.TAB);

        //passwordInputField.click();
        passwordInputField.sendKeys("password");
       // passwordInputField.sendKeys(Keys.ENTER);
       // passwordInputField.submit();
        loginButton.click();

      //  Thread.sleep(2000);

        searchBar.click();
        searchBar.sendKeys("ball");
        searchBar.sendKeys(Keys.ENTER);

    }
}
