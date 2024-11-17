package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumActionClass {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://monsur26.github.io/mypage/");

        WebElement dragMeButton = driver.findElement(By.id("drag-item"));
        WebElement targetdropZone = driver.findElement(By.xpath("//p[text()='Drop items here:']"));
        WebElement homelink = driver.findElement(By.linkText("Home"));
        WebElement shoplink = driver.findElement(By.linkText("Shop"));


        //using Actions class to do mouse functions

        // Create an object of Actions Class

        Actions actions = new Actions(driver);


/*        // mouse hover
        actions.moveToElement(homelink).build().perform();
        //context click is for right click on mouse
        actions.moveToElement(homelink).contextClick().build().perform();*/

     /*   //click and Hold
        actions.moveToElement(shoplink).clickAndHold().build().perform();*/

        //drag and drop
        actions.dragAndDrop(dragMeButton,targetdropZone).build().perform();





    }
}
