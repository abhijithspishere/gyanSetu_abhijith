package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class User_Profile extends BasePage {

        public User_Profile(WebDriver driver)
        {
            super(driver);
        }

        @FindBy(xpath = "//button[@aria-label='close']")
        WebElement Btn_profileChat_close;

        @FindBy(xpath = "//button[normalize-space()='Ok']")
        WebElement Btn_CloseChat;

        @FindBy(xpath = "//img[@class='rounded-circle p-1 border']")
        WebElement Btn_ProfileDrop;

        @FindBy(xpath = "//a[normalize-space()='Profile']")
        WebElement Btn_Profile;

        @FindBy(xpath = "//input[@name='first_name']")
        WebElement txt_firstName;

        @FindBy(name="last_name")
        WebElement txt_lastname;

        @FindBy(xpath = "//input[@value='female']")
        WebElement radioBtn_Gender;

        @FindBy(xpath = "//input[@id=':r5:']")
        WebElement dateOfBirth;

        public void profileClose() throws InterruptedException {
            Btn_profileChat_close.click();
//            System.out.println("clicked close button");
//            Thread.sleep(1000);
        }

        public void Closechat() {
            Btn_CloseChat.click();
        }

        public void click_ProfileDrop(){
            Btn_ProfileDrop.click();
        }

        public void click_Profile(){
            Btn_Profile.click();
        }

        public void input_firstname (String firstname ){
            txt_firstName.clear();
            txt_firstName.sendKeys(firstname);
        }

        public void input_lastname(String lastname){
            txt_lastname.clear();
            txt_lastname.sendKeys(lastname);
        }
        public void choice_Gender(){
            radioBtn_Gender.click();
        }

        public void setDateOfBirth() throws InterruptedException {
            dateOfBirth.click();
//            dateOfBirth.clear();
            dateOfBirth.sendKeys("12/12/2005");
        }

}
