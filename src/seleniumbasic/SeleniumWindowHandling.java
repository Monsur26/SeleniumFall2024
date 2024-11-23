package seleniumbasic;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.ArrayList;
import java.util.List;

public class SeleniumWindowHandling {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://monsur26.github.io/mypage/");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://google.com");
        // creating windowhandle to switch between windows
        String oldTab = driver.getWindowHandle();
        //putting all of the tabs on a list, so that I can switch between windows by
        //specifying index
        List<String> newTabs = new ArrayList<String>(driver.getWindowHandles());

        // Takes user to first Tab
        driver.switchTo().window(newTabs.get(0));
        Thread.sleep(1000);
        // Takes user to the second Tab
        driver.switchTo().window(newTabs.get(1));
        //Closes the current Tab
        driver.close();
    }
}
