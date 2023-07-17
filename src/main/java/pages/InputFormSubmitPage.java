package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormSubmitPage extends BasePage {
    public InputFormSubmitPage(WebDriver driver) {
        super(driver);
    }

    public void fillNameField(String test) {
        driver.findElement(By.xpath("//*[@id=\"name\"]"));
    }
    public void fillEmailField(String email) {
        driver.findElement(By.xpath("//*[@id=\"inputEmail4\"]"));
    }
    public void fillPasswordField(String pass) {
        driver.findElement(By.xpath("//*[@id=\"inputPassword4\"]"));
    }
    public void fillCompanyField(String testCompany) {
        driver.findElement(By.xpath("//*[@id=\"company\"]"));
    }
    public void fillWebsiteField(String s) {
        driver.findElement(By.xpath("//*[@id=\"websitename\"]"));
    }
    public void fillCityField(String cluj) {
        driver.findElement(By.xpath("//*[@id=\"inputCity\"]"));
    }
    public void fillFirstAddressField(String firstAddress) {
        driver.findElement(By.xpath("//*[@id=\"inputAddress1\"]"));
    }
    public void fillSecondAddressField(String secondAddress) {
        driver.findElement(By.xpath("//*[@id=\"inputAddress2\"]"));
    }
    public void fillStateField(String cluj) {
        driver.findElement(By.xpath("//*[@id=\"inputState\"]"));
    }
    public void fillZipField(String number) {
        driver.findElement(By.xpath("//*[@id=\"inputZip\"]"));
    }
    public void clickSubmitButton() {
        driver.findElement(By.xpath("//*[@id=\"seleniumform\"]/div[6]/button"));
    }

}
