package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage  extends BasePage {
    public LoginPage(WebDriver driver)
    {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='btn btn-secondary w-100 outsecbtn rounded-pill']")
    WebElement SignInButton;

    @FindBy(id = "email/phone")
    WebElement textEmail;

    @FindBy(id = "passwordInput")
    WebElement textPassword;

    @FindBy(xpath = "//button[text()='Sign in Now']")
    WebElement btn_signInNow;

    @FindBy(xpath = "//div[@class='message-bubble p-3 left']")
    WebElement chatBoxName;

    public void clickSignIn()
    {
        SignInButton.click();
    }

    public void inputEmail (String email)
    {
        textEmail.sendKeys(email);
    }

    public void inputPassword (String password)
    {
        textPassword.sendKeys(password);
    }

    public void clickBtnSignIn()
    {
        btn_signInNow.click();
    }

    public String chatBoxTextValidation() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement chatBox = wait.until(ExpectedConditions.visibilityOf(chatBoxName));
        return chatBox.getText().trim();
    }



}
