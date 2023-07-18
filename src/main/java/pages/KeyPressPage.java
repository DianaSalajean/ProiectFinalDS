package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver) {
        super (driver);
    }
    public void clickOnField() {
        driver.findElement(By.linkText("Key Press"));
        driver.findElement(By.xpath("//*[@id=\"my_field\"]")).click();
        WebElement resultElement = driver.findElement(By.xpath("//*[@id=\"result\"]"));
    }

}
