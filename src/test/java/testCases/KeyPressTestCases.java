package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.KeyPressPage;

import java.awt.*;
import java.awt.event.KeyEvent;

import static java.awt.event.KeyEvent.VK_ENTER;

public class KeyPressTestCases extends BasePage {
    private KeyPressPage keyPressPage;



    @BeforeMethod
    public void setUp(){
        super.setUp();
        keyPressPage = new KeyPressPage(driver);}

    @Test
    public void PressEnterAndCheckThatTheMessageReturnedIsCorrect() throws InterruptedException{
        driver.findElement(By.linkText("Key Press")).click();
        keyPressPage.clickOnField();
        WebElement resultElement = driver.findElement(By.xpath("//*[@id=\"my_field\"]"));
        Robot robot = new Robot();
        robot.keyPress(VK_ENTER);
        String actualResultText = resultElement.getText();
        String expectedResultText = "You entered: ENTER";
        Assert.assertEquals(actualResultText, expectedResultText, "Entered text is incorrect");

    }


}