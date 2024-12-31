package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

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

        @FindBy(xpath = "//div[@class='form-step active']//div[@class='row']//input[@name='address1']")
        WebElement txt_Address1;

        @FindBy(xpath = "//div[@class='form-step active']//div[@class='row']//input[@name='address2']")
        WebElement txt_Address2;

        @FindBy(xpath = "//div[@class='form-step active']//div[@class='row']//select[@name='rcrs-country']")
        WebElement dropCountry;

        @FindBy(xpath = "//div[@class='form-step active']//div[@class='row']//select[@name='rcrs-region']")
        WebElement dropState;

        @FindBy(xpath = "//div[@class='form-step active']//div[@class='row']//input[@name='city']")
        WebElement txt_City;

        @FindBy(xpath = "//div[@class='form-step active']//div[@class='row']//input[@name='district']")
        WebElement txt_District;

        @FindBy(xpath = "//div[@class='form-step active']//div[@class='row']//input[@name='pincode']")
        WebElement txt_Pincode;

        @FindBy(xpath = "//input[@name='sameAsCurrent']")
        WebElement sameAsCurrent;

        @FindBy(xpath = "//div[@class='step active']")
        WebElement selectHobby;

        @FindBy(xpath="//div[@id='demo-multiple-checkbox']")
        WebElement hobbyChkbox;

        @FindBy(xpath = "//div[@id='menu-']//li[1]")
        WebElement hobbySketching;

        public void profileClose() throws InterruptedException {
            Btn_profileChat_close.click();
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

            upload_profilePicture.sendKeys("C:/Users/WIIS/Downloads/WhatsApp Image 2024-11-05 at 10.34.37_aa138e0asss.jpg");

        }
        public void set_Address(){
            select_Address.click();
        }

        public  void input_Address(String address){
            txt_Address1.sendKeys(address);
        }

        public void input_Address2(String address2){
            txt_Address2.sendKeys(address2);
        }

        public void select_Country(){
            Select sl =  new Select(dropCountry);
            sl.selectByVisibleText("India");

        }
        public void select_State() throws InterruptedException {
//            Thread.sleep(2000);
            Select sl_state = new Select(dropState);
            sl_state.selectByVisibleText("Kerala");
        }
        public void input_City(String city){
            txt_City.sendKeys(city);
        }

        public void input_District(String district){
            txt_District.sendKeys(district);
        }

        public void inputPincode (String pincode){
            txt_Pincode.sendKeys(pincode);
        }

        public void setSameAsCurrentAddress() throws InterruptedException {
            sameAsCurrent.click();

        }

        public void setHobby() throws InterruptedException {
            Thread.sleep(2000);
            selectHobby.click();
            System.out.println("clickedHobby");
            hobbyChkbox.click();
            hobbySketching.click();
        }

}
