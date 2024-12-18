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

        @FindBy(xpath = "//button[@aria-label='Choose date']")
        WebElement dateOfBirth;

        @FindBy(xpath = "//button[normalize-space()='17']")
        WebElement calendarDate;

        @FindBy(xpath = "//input[@name='father_name']")
        WebElement txt_fatherName;

        @FindBy(xpath = "//input[@name='mother_name']")
        WebElement txt_motherName;

        @FindBy(xpath = "//input[@name='guardian_name']")
        WebElement txt_guardianName;

        @FindBy(xpath = "//input[@name='aim']")
        WebElement txt_aim;

        @FindBy(xpath = "//input[@id='file']")
        WebElement upload_profilePicture;

        @FindBy(xpath = "//div[@class='wizard-sidebar']//div[4]//div[1]")
        WebElement select_Address;

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
//            dateOfBirth.sendKeys("12/12/2005");
            calendarDate.click();
        }

        public void input_fathername(String fatherName){
            txt_fatherName.sendKeys(fatherName);
        }

        public void input_motherName(String motherName){
            txt_motherName.sendKeys(motherName);
        }

        public void input_guardianName(String guardianName){
            txt_guardianName.sendKeys(guardianName);
        }

        public void input_aim(String aim){
            txt_aim.sendKeys(aim);
        }

        public void set_profilePicture(){
//            upload_profilePicture.click();
            upload_profilePicture.sendKeys("C:/Users/WIIS/Downloads/WhatsApp Image 2024-11-05 at 10.34.37_aa138e0asss.jpg");

        }
        public void set_Address(){
            select_Address.click();
        }

}
