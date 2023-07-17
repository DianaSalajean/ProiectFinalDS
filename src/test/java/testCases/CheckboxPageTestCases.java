package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.CheckboxPage;

public class CheckboxPageTestCases extends BasePage {

    private CheckboxPage checkboxDemoPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkboxDemoPage = new CheckboxPage(driver);
    }

    @Test
    public void clickOnTheSingleCheckboxCheckMark() throws InterruptedException {

        driver.findElement(By.linkText("Checkbox Demo")).click();
        checkboxDemoPage.clickOnSingleCheckbox();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");

    }
}

