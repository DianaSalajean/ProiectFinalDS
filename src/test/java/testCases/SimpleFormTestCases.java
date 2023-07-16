package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.SimpleFormPage;

public class SimpleFormTestCases extends BasePage {
    private SimpleFormPage simpleFormPage;
    @BeforeMethod
    public void setUp(){
        super.setUp();
        simpleFormPage = new SimpleFormPage(driver);
    }

    @Test
    public void writeTextThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.linkText("Simple Form Demo")).click();
        simpleFormPage.selectTextField("Test");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test"));
    }

    @Test
    public void writeTextAndNumbersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test123");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test123"));
    }

    @Test
    public void writeNumbersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("123");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("123"));
    }

    @Test
    public void writeSpecialCharactersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("!?.,");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("!?.,"));
    }

    @Test
    public void writeTextNumbersAndSpecialCharactersThenClickOnTheGetCheckedValueButton() throws InterruptedException{
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();
        simpleFormPage.selectTextField("Test123!");
        simpleFormPage.clickOnGetCheckedValue();
        Assert.assertTrue(driver.getPageSource().contains("Test123!"));
    }
}