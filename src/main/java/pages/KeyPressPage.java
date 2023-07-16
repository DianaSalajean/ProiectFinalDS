package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressPage extends BasePage {
    public KeyPressPage(WebDriver driver) {
        super (driver);
    }
    public void clickOnField() {
        driver.findElement(By.linkText("Key Press"));
        driver.findElement(By.id("result"));
        driver.findElement(By.id("my_field")).sendKeys("ENTER");

    }

}
