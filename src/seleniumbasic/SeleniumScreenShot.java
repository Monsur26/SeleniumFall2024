package seleniumbasic;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

public class SeleniumScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new EdgeDriver();

        //maximize the browser
        driver.manage().window().maximize();

        //get() method takes you to a specific web address
        driver.get("https://monsur26.github.io/mypage/");

        Random random = new Random();
        int randomInt = random.nextInt(1000);
        String name="Image"+randomInt ;

        //create object variable of TakeScreenshot class
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        //create File object variable which holds the screen shot reference
        File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
        //store the screen shot path in path variable. Here we are storing the screenshots under screenshots folder
        String path = "C:\\Users\\Monsu\\Selenium_Fall2024\\Screenshot\\" +name+".png";
        //create another File object variable which points(refer) to the above stored path variable
        File destination = new File(path);
        //use FileUtils class method to save the screen shot at desired path
        FileUtils.copyFile(source,destination);
   }
}
