package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonsPage extends BasePage {
    public RadioButtonsPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnMale() {
        driver.findElement(By.name("optradio")).click();
    }

    By TextField = By.name("optradio");

    public void clickOnFemale() {
        driver.findElement(By.name("optradio")).click();
    }
}

