package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
        inputFormSubmitPagePage.fillEmailField("test@test.com");
        inputFormSubmitPagePage.fillPasswordField("pass");
        inputFormSubmitPagePage.fillCompanyField("testCompany");
        inputFormSubmitPagePage.fillWebsiteField("www.test.com");
        inputFormSubmitPagePage.fillCityField("Cluj");
        inputFormSubmitPagePage.fillFirstAddressField("first address");
        inputFormSubmitPagePage.fillSecondAddressField("second address");
        inputFormSubmitPagePage.fillStateField("Cluj");
        inputFormSubmitPagePage.fillZipField("123123");
        inputFormSubmitPagePage.clickSubmitButton();
        WebElement successMessage = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div/p"));
        String messageText = successMessage.getText();

        Assert.assertEquals(messageText, "Thanks for contacting us, we will get back to you shortly.",
                "Incorrect success message text");
    }
}
