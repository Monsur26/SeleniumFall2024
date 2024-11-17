package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MyFirstSelenium {
    public static void main(String[] args) throws InterruptedException {
/*        System.setProperty("webdriver.chrome.driver","C:\\Users\\Monsu\\Fall2024_Selenium\\Driver\\Chrome\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();*/

        System.setProperty("webdriver.msedge.driver","C:\\Users\\Monsu\\Fall2024_Selenium\\Driver\\Edgebrowser\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://www.amazon.com/");

        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).click();
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Ball");
        driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).submit();
        Thread.sleep(2000);

        // closing the tab
        //driver.close();

        //quiting the browser
        driver.quit();



    }
}
