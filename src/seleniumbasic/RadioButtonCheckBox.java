package seleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtonCheckBox {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.get("https://monsur26.github.io/mypage/");

        WebElement radioButton2 = driver.findElement(By.id("radio2"));
        WebElement radioButton1 = driver.findElement(By.id("radio1"));
        WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
        WebElement checkbox2 = driver.findElement(By.id("checkbox2"));

        boolean selected = true;
        radioButton2.click();

        //isSelected() is a boolean function to check whether ot not an element is selected
        selected= radioButton1.isSelected();// false
        System.out.println(selected);

        checkbox1.click();
        checkbox2.click();

        System.out.println("check box 1 is selected? :"+ checkbox1.isSelected());
        System.out.println("check box 2 is selected? :"+ checkbox2.isSelected());



    }
}
