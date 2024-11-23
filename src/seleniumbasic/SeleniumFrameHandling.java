package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumFrameHandling {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://monsur26.github.io/mypage/");

        // switchTo().frame navigates to the specific frame wither by index, name or ID
        driver.switchTo().frame("frame1");

        WebElement searchBtnWiki = driver.findElement(By.xpath("//*[@id=\"p-search\"]/a/span[1]"));
        WebElement searchBarWiki = driver.findElement(By.xpath("//input[@placeholder='Search Wikipedia']"));
        searchBtnWiki.click();
/*        searchBarWiki.click();
        searchBarWiki.sendKeys("Selenium");
        searchBtnWiki.submit();*/

        // switchTo().defaultContent() takes you back to the original page
        driver.switchTo().defaultContent();


        // driver.getTitle() will fetch the title of the webpage
        System.out.println(driver.getTitle());
    }
}
