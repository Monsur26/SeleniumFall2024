package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumWait {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://monsur26.github.io/mypage/");

        //The Implicit Wait in Selenium is used to tell
        // the web driver to wait for a certain amount of time before
        // it throws a “No Such Element Exception”
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement shoplink = driver.findElement(By.linkText("Shop"));
        shoplink.click();

        WebElement example1link = driver.findElement(By.xpath("//button[text()='Shop 1']"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(example1link));
        example1link.click();

    }
}
