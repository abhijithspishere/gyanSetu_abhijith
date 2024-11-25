package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage
{
    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement btnRegister;

    @FindBy(xpath = "//input[@id='emailphone']")
    WebElement txtEmail;

    @FindBy(xpath="//input[@placeholder='Password']")
    WebElement txtPassword;

    @FindBy(xpath="//input[@id='flexCheckDefault']")
    WebElement checkTandC;

    @FindBy(xpath = "//button[normalize-space()='Sign Up Now']")
    WebElement btnSignUp;


    public  void clickRegister_btn()
    {
        btnRegister.click();
    }
    public void setEmail(String email)
    {
        txtEmail.sendKeys(email);
    }
    public void setTxtPassword(String password)
    {
        txtPassword.sendKeys(password);
    }
    public void clickTandC() throws InterruptedException {
        checkTandC.click();
        Thread.sleep(1000);
    }

    public void clickSignUpNow() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSignUp);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",btnSignUp);
        btnSignUp.click();
    }

}
