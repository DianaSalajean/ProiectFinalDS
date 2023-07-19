package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.InputFormSubmitPage;

public class InputFormSubmitTestCases extends BasePage {
    private InputFormSubmitPage inputFormSubmitPagePage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        inputFormSubmitPagePage = new InputFormSubmitPage(driver);
    }

    @Test
    public void FillTheEntireFormAndClickSubmit() throws InterruptedException {

        driver.findElement(By.linkText("Input Form Submit")).click();
        inputFormSubmitPagePage.fillNameField("test");
        driver.findElement(By.id("name")).sendKeys("test");
        inputFormSubmitPagePage.fillEmailField("test@test.com");
        driver.findElement(By.xpath("//*[@id=\"inputEmail4\"]")).sendKeys("test@test.com");
        inputFormSubmitPagePage.fillPasswordField("pass");
        driver.findElement(By.xpath("//*[@id=\"inputPassword4\"]")).sendKeys("pass");
        inputFormSubmitPagePage.fillCompanyField("testCompany");
        driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("testCompany");
        inputFormSubmitPagePage.fillWebsiteField("www.test.com");
        driver.findElement(By.xpath("//*[@id=\"websitename\"]")).sendKeys("www.test.com");
        Select countriesDropDown = new Select(driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[3]/div[1]/select")));
        countriesDropDown.selectByVisibleText("Romania");
        inputFormSubmitPagePage.fillCityField("Cluj");
        driver.findElement(By.xpath("//*[@id=\"inputCity\"]")).sendKeys("Cluj");
        inputFormSubmitPagePage.fillFirstAddressField("first address");
        driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]")).sendKeys("first adress");
        inputFormSubmitPagePage.fillSecondAddressField("second address");
        driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]")).sendKeys("second adress");
        inputFormSubmitPagePage.fillStateField("Cluj");
        driver.findElement(By.xpath("//*[@id=\"inputState\"]")).sendKeys("Cluj");
        inputFormSubmitPagePage.fillZipField("123123");
        driver.findElement(By.xpath("//*[@id=\"inputZip\"]")).sendKeys("123123");
        inputFormSubmitPagePage.clickSubmitButton();
        WebElement successMessage = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/p"));
        String messageText = successMessage.getText();

        Assert.assertEquals(messageText, "Thanks for contacting us, we will get back to you shortly.",
                "Incorrect success message text");
    }
}