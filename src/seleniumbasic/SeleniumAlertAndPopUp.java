package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumAlertAndPopUp {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://monsur26.github.io/mypage/");

        WebElement alertGeneration = driver.findElement(By.id("alert-Btn"));
        alertGeneration.click();

        // alert().accept will accpet the alert ie click OK button
        //driver.switchTo().alert().accept();

        //alert().dismiss() will cancel the alert.
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().accept();

        driver.quit();
    }
}
