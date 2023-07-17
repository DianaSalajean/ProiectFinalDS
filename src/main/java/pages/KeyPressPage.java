package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver) {
        super (driver);
    }
    public void clickOnField() {
        driver.findElement(By.linkText("Key Press"));
        driver.findElement(By.id("result"));
        driver.findElement(By.id("my_field")).click();
        WebElement resultElement = driver.findElement(By.id("result"));
    }

}
