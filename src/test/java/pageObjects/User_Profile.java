package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.time.Duration;
import java.util.List;

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

        @FindBy(xpath = "//button[@title='Previous month']//*[name()='svg']")
        WebElement slctPreviousMonth;

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

//      @FindBy(xpath = "//div[@class='wizard-sidebar']//div[4]//div[1]")
//      WebElement select_Address;

        @FindBy(xpath = "//button[contains(@class,'btn btn-dark px-lg-5 mt-3 ms-auto d-block rounded-pill next-btn px-4')]")
        WebElement select_AddressNext;

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

      /*  @FindBy(xpath = "//div[@class='wizard-sidebar']//div[5]//div[1]")
        WebElement selectHobby;*/

        @FindBy(xpath = "//div[contains(@class,'row form_field_wrapper')]//button[contains(@type,'button')][normalize-space()='Next']")
        WebElement selectHobby;

        @FindBy(xpath ="//div[@id='demo-multiple-checkbox']")
        WebElement hobbyChkboxes;

        @FindBy(xpath = "//li[1]//span[1]//input[1]")
        WebElement slctSketching;

        @FindBy(xpath = "//span[normalize-space()='Drawing']")
        WebElement slctDrawing;

        @FindBy(xpath = "//span[normalize-space()='Speaking']")
        WebElement slctSpeaking;

        @FindBy(xpath = "//span[normalize-space()='Dancing']")
        WebElement slctDancing;

        @FindBy(xpath = "//span[normalize-space()='cricket']")
        WebElement slctCricket;

        @FindBy(xpath = "//span[normalize-space()='Reading']")
        WebElement slctReading;

        @FindBy(xpath = "//span[normalize-space()='Painting']")
        WebElement slctPainting;

        @FindBy(xpath = "//span[normalize-space()='Cooking']")
        WebElement slctCooking;

        @FindBy(xpath = "//span[normalize-space()='Running']")
        WebElement slctRunning;

        @FindBy(xpath = "//span[normalize-space()='Swimming']")
        WebElement slctSwimmimg;

        @FindBy(xpath = "//span[normalize-space()='Singing']")
        WebElement slctSinging;

        @FindBy(xpath = "//span[normalize-space()='Travelling']")
        WebElement slctTravelling;

        @FindBy(xpath = "//div[@id='language-select-0']")
        WebElement selectLanguage;

        @FindBy(xpath = "//li[contains(text(),'English')]")
        WebElement selectEnglish;

        @FindBy(xpath = "//div[@id='proficiency-select-0']")
        WebElement selectProficiency;

        @FindBy(xpath = "//li[normalize-space()='Both']")
        WebElement selectBoth;

      /*@FindBy(xpath = "//div[@class='wizard-sidebar']//div[6]//div[1]//*[name()='svg']")
        WebElement selectAcademic;*/

        @FindBy(xpath = "//div[contains(@class,'row justify-content-center')]//button[contains(@type,'button')][normalize-space()='Next']")
        WebElement selectAcademic;

        @FindBy(xpath = "//div[@class='MuiFormControl-root css-1mol256']//div[@role='combobox']")
        WebElement selectInstitute;

        @FindBy(xpath = "//li[normalize-space()='School']")
        WebElement selectSchool;

        @FindBy(xpath = "//div[@class='form-step active']//div[2]//div[1]//div[1]//div[1]")
        WebElement selectBoard;

        @FindBy(xpath = "//li[normalize-space()='CBSE']")
        WebElement selectCbse;

        @FindBy(xpath = "//div[@class='row align-items-center']//div[@class='MuiFormControl-root css-mla5jh']//div[@role='combobox']")
        WebElement selectClass;

        @FindBy(xpath = "//li[normalize-space()='class 09']")
        WebElement selectClass09;

      /*@FindBy(xpath="//div[@class='wizard-sidebar']//div[7]//div[1]//*[name()='svg']")
        WebElement contactDetails;*/

        @FindBy(xpath = "//button[@class='btn btn-dark px-lg-5 ms-auto d-block rounded-pill next-btn']")
        WebElement NextAcademic;

        @FindBy(xpath = "//input[@name='phoneNum']")
        WebElement mobileNumber;

        @FindBy(xpath = "//input[@name='whatsappNum']")
        WebElement whatsappNumber;

       /* @FindBy(xpath = "//div[@class='wizard-sidebar']//div[8]//div[1]//*[name()='svg']")
        WebElement SubjectPreference;*/

        @FindBy(xpath = "//div[contains(@class,'form-step active')]//button[contains(@type,'button')][normalize-space()='Next']")
        WebElement SubjectPreference;

        @FindBy(xpath = "//div[@id='mui-component-select-subject_id']")
        WebElement subjectSelection;

        @FindBy(xpath = "//li[normalize-space()='Science']")
        WebElement scienceSelection;

        @FindBy(xpath = "//input[@name='preference']")
        WebElement preferenceSubject;

        @FindBy(xpath = "//input[@name='score_in_percentage']")
        WebElement scorePercentage;

        @FindBy(xpath = "//button[normalize-space()='Submit']")
        WebElement submit;

        @FindBy(xpath = "//input[@placeholder='Type your question']")
        WebElement inputChat;


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
            Thread.sleep(1000);
            slctPreviousMonth.click();
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

        public void set_profilePicture() throws InterruptedException {

            upload_profilePicture.sendKeys("C:/Users/WIIS/Downloads/WhatsApp Image 2024-11-05 at 10.34.37_aa138e0asss.jpg");
            Thread.sleep(1000);
        }
        public void set_Address(){

             JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",select_AddressNext);
        js.executeScript("arguments[0].click()",select_AddressNext);
        }

        public  void input_Address(String address){
            txt_Address1.sendKeys(address);
        }

        public void input_Address2(String address2){
            txt_Address2.sendKeys(address2);
        }

        public void select_Country(String county){
            Select sl =  new Select(dropCountry);
            sl.selectByVisibleText(county);

        }
        public void select_State(String state) throws InterruptedException {
//            Thread.sleep(2000);
            Select sl_state = new Select(dropState);
            sl_state.selectByVisibleText(state);
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

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",selectHobby);
        js.executeScript("arguments[0].click()",selectHobby);
    }
        /*JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",selectHobby);
        js.executeScript("arguments[0].click()",selectHobby);*/

       /* JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", selectHobby);
        js.executeScript("arguments[0].click();", selectHobby);*/

        public void setCheckBox () throws InterruptedException {
            Thread.sleep(2000);
//            JavascriptExecutor js=(JavascriptExecutor)driver;
//
//            js.executeScript("arguments[0].click()",hobbyChkboxes);
            hobbyChkboxes.click();
            slctSketching.click();
            slctDrawing.click();
            slctSpeaking.click();
            slctDancing.click();
            slctCricket.click();
            slctReading.click();
            slctPainting.click();
            slctCooking.click();
            slctRunning.click();
            slctSwimmimg.click();
            slctSinging.click();
            slctTravelling.click();
            Actions actions = new Actions(driver);
//            actions.sendKeys(Keys.ENTER).perform();
            actions.sendKeys(Keys.ESCAPE).perform();
        }

        public void setSelectLanguage(){
            selectLanguage.click();
            selectEnglish.click();
            Actions actions = new Actions(driver);
            actions.sendKeys(Keys.ESCAPE).perform();
        }

        public void setProficiency(){
            selectProficiency.click();
            selectBoth.click();
        }

        public void setSelectAcademic(){
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView();",selectAcademic);
            js.executeScript("arguments[0].click()",selectAcademic);
        }

        public void setInstituteType() throws InterruptedException {
            selectInstitute.click();
            selectSchool.click();
            Thread.sleep(1000);
        }
        public void setBoard() throws InterruptedException {
            selectBoard.click();
            selectCbse.click();
            Thread.sleep(1000);
        }

        public void setClass() throws InterruptedException {
            selectClass.click();
            Thread.sleep(2000);
            selectClass09.click();

        }

        public void ClickNext(){
            NextAcademic.click();
        }

        public void ContactPage(){
//            System.out.println("Adding Contact Details");
        }

        public void setMobileNumber(String mobNumber){
            mobileNumber.sendKeys(mobNumber);
        }

        public void setWhatsappNumber(String whatsapp){
            whatsappNumber.sendKeys(whatsapp);
        }

        public void clickSubjectPreference(){
            JavascriptExecutor js=(JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView();",SubjectPreference);
            js.executeScript("arguments[0].click()",SubjectPreference);
        }

        public void setSubject() throws InterruptedException {
            Thread.sleep(3000);
            subjectSelection.click();
//            JavascriptExecutor js=(JavascriptExecutor)driver;
//
//            js.executeScript("arguments[0].click()",subjectSelection);

            scienceSelection.click();
        }

        public void setPreference(){
            preferenceSubject.sendKeys("Learn Smarter");
        }

        public void setScorePercentage(String score){
            scorePercentage.sendKeys(score);
        }

        public void btnSubmit()
        {
            submit.click();

        }

        public void SuccessMessage() throws InterruptedException {
            Thread.sleep(2000);
            String validation = inputChat.getAttribute("placeholder");
            if(validation.equals("Type your question")){
                System.out.println("User Entered Profile Details Successfully and reached Dashboard");

            }

        }

}
