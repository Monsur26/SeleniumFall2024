package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumSelectClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://monsur26.github.io/mypage/");

        //WebElemnet
        WebElement dropDown1 = driver.findElement(By.id("select"));

        //Select Class to access a dropdown
        Select select = new Select(dropDown1);
        //select.selectByIndex(0);
        select.selectByValue("option3");
    }
}
