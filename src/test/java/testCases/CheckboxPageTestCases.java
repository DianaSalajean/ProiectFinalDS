package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import pages.BasePage;
import pages.CheckboxPage;
import pages.SimpleFormPage;

public class CheckboxPageTestCases extends BasePage{
    private CheckboxPage checkboxPage;

    @BeforeMethod
    public void setUp(){
        super.setUp();
        checkboxPage = new CheckboxPage(driver);
    }

    @Test
    public void clickOnTheSingleCheckboxCheckmark() throws InterruptedException{
        driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")).click();
        checkboxPage.clickOnSingleCheckbox();
        Assert.assertEquals("Success - Check box is checked", "Success - Check box is checked");
    }
}

