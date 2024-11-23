package seleniumbasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SeleniumHeadlessTest {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\Monsu\\Selenium_Fall2024\\Driver\\ChromeDriver\\chromedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--headless=true");
        WebDriver driver = new EdgeDriver(options);

        driver.get("https://monsur26.github.io/mypage/");

        driver.quit();
    }
}
