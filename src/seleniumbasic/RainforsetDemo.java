package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class RainforsetDemo {
    public static void main(String[] args) throws InterruptedException {
/*        System.setProperty("webdriver.chrome.driver","C:\\Users\\Monsu\\Fall2024_Selenium\\Driver\\Chrome\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();*/

       // System.setProperty("webdriver.msedge.driver", "C:\\Users\\Monsu\\Fall2024_Selenium\\Driver\\Edgebrowser\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://monsur26.github.io/mypage/");

        // finding by id
        driver.findElement(By.id("username")).sendKeys("Username");
        //finding by class
        int number = driver.findElements(By.className("scroller-button")).size();
        System.out.println(number);
        //finding by name
        driver.findElement(By.name("password")).sendKeys("password");
        //finding by Tag
        String text = driver.findElement(By.tagName("select")).getText();
        System.out.println(text);
        //finding by linktext
        driver.findElement(By.linkText("Shop")).click();
        // finding by partial link text
        driver.findElement(By.partialLinkText("To Home")).click();
       // driver.findElement(By.partialLinkText("Con")).click();

        driver.findElement(By.xpath("/html/body/section/form/input[1]")).sendKeys("Test");


        // closing the tab
        //driver.close();

        //quiting the browser
        driver.quit();
    }
}
