package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBrowserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://monsur26.github.io/mypage/");

        WebElement homelink = driver.findElement(By.linkText("Home"));
        WebElement shoplink = driver.findElement(By.linkText("Shop"));

        shoplink.click();
        Thread.sleep(2000);

        // Takes user back to previous page
        driver.navigate().back();
        Thread.sleep(1000);
        // takes user forward to the previously visited page
        driver.navigate().forward();
        Thread.sleep(1000);
        //refresh the page
        driver.navigate().refresh();

        driver.quit();



    }
}
