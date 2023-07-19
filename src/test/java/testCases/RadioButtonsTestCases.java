package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.RadioButtonsPage;

public class RadioButtonsTestCases extends BasePage {
    private RadioButtonsPage RadioButtonsPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        RadioButtonsPage = new RadioButtonsPage(driver);
    }

    @Test
    public void clickOnMale() throws InterruptedException {

        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        RadioButtonsPage.clickOnMale();
        Assert.assertEquals("Success-Male is checked", "Success-Male is checked");

    }

    @Test
    public void clickOnFemale() throws InterruptedException {

        driver.findElement(By.linkText("Radio Buttons Demo")).click();
        RadioButtonsPage.clickOnFemale();
        Assert.assertEquals("Success-Female is checked", "Success-Female is checked");

    }
}
