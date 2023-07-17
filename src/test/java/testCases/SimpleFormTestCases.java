package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

    @Test
    public void checkThatTheInputFieldIsEmptyFalse() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"user-message\"]")).click();
        WebElement yourMessage = driver.findElement(By.xpath("//*[@id=\"message\"]"));
        Assert.assertEquals(false, yourMessage.isDisplayed());
    }

    @Test
    public void checkThatTheInputFieldIsEmptyTrue() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"user-message\"]")).click();
        WebElement yourMessage = driver.findElement(By.xpath("//*[@id=\"message\"]"));
        Assert.assertEquals(true, yourMessage.isDisplayed());
    }

    @Test
    public void twoInputFieldsNumbers() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"sum1\"]")).sendKeys("3");
        driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys("23");
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        WebElement yourValue = driver.findElement(By.xpath("//*[@id=\"addmessage\"]"));
        Assert.assertEquals(26, 26);
    }


    @Test
    public void twoInputFieldsText() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/section[2]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"sum1\"]")).sendKeys("a");
        driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys("b");
        driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
        WebElement yourValue = driver.findElement(By.xpath("//*[@id=\"addmessage\"]"));
        Assert.assertEquals("a+b", "a+b");
    }
}