package StepDefinition;

import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import pageObjects.User_Profile;


public class userprofileStepdefinition {


    User_Profile up = new User_Profile(Hooks.driver);

    @Given("The user is on the Basic Information section")
    public void the_user_is_on_the_basic_information_section() throws InterruptedException {
        System.out.println("Entering FirstName now");

    }

    @When("The user enters {string} as First Name")
    public void the_user_enters_as_first_name(String stringFirstName) {
      up.input_firstname(stringFirstName);

    }

    @And("The user enters {string} as Last Name")
    public void the_user_enters_as_last_name(String stringlastname) {
       up.input_lastname(stringlastname);
    }

    @And("The user selects Gender")
    public void theUserSelectsGender() {
        up.choice_Gender();
    }

    @And("The user enters DOB")
    public void theUserEntersDOB() throws InterruptedException {
        up.setDateOfBirth();
    }

    @When("The user enters {string} as Father Name")
    public void the_user_enters_as_father_name(String stringfather) {
        up.input_fathername(stringfather);
    }

    @When("The user enters {string} as Mother Name")
    public void the_user_enters_as_mother_name(String stringMothername) {
        up.input_motherName(stringMothername);
    }

    @When("The user enters {string} as Guardian Name")
    public void the_user_enters_as_guardian_name(String stringGuardianName) {
       up.input_guardianName(stringGuardianName);
    }

    @When("The user enters {string} as Aim")
    public void the_user_enters_as_aim(String stringAim) {
     up.input_aim(stringAim);
    }

    @When("The user uploads a profile picture")
    public void the_user_uploads_a_profile_picture() {
       up.set_profilePicture();
    }

    @And("The user clicks the Address Section")
    public void theUserClicksTheAddressSection() {
        up.set_Address();
    }

    @And("The user enters {string} as FirstAddress")
    public void theUserEntersAsFirstAddress(String stringAddress_1) {
        up.input_Address(stringAddress_1);
    }

    @And("The user enters {string} as SecondAddress")
    public void theUserEntersAsSecondAddress(String stringAddress_2) {
        up.input_Address2(stringAddress_2);
    }


    @And("The user selects India as Country")
    public void theUserSelectsAsCountry() throws InterruptedException {
        up.select_Country();
//        Thread.sleep(1000);
    }


    @When("The user selects Kerala as State")
    public void the_user_selects_as_state() throws InterruptedException {
      up.select_State();
    }

    @When("The user enters {string} as City")
    public void the_user_enters_as_city(String stringCity) {
        up.input_City(stringCity);

    }

    @When("The user enters {string} as District")
    public void the_user_enters_as_district(String stringDistrict) {
        up.input_District(stringDistrict);
    }

    @When("The user enters {string} as Pincode")
    public void the_user_enters_as_pincode(String stringPincode) {
        up.inputPincode(stringPincode);
    }

    @When("The user selects Same as Current Address for permanent address")
    public void the_user_selects_same_as_current_address_for_permanent_address() throws InterruptedException {
       up.setSameAsCurrentAddress();
    }

    @When("The user clicks the Hobbies Language Session")
    public void the_user_clicks_the_hobbies_language_session() throws InterruptedException {
        up.setHobby();
    }
    @When("The user selects {string} as Hobby")
    public void the_user_selects_as_hobby(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user selects {string} as Language Known")
    public void the_user_selects_as_language_known(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user selects Both as Proficiency")
    public void the_user_selects_both_as_proficiency() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user clicks the Academic History Session")
    public void the_user_clicks_the_academic_history_session() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user selects Institute Type as School")
    public void the_user_selects_institute_type_as_school() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user selects CBSE as Board")
    public void the_user_selects_cbse_as_board() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user selects Class {int} as Class")
    public void the_user_selects_class_as_class(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user clicks the Contact Details")
    public void the_user_clicks_the_contact_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user enters {string} as Mobile Number")
    public void the_user_enters_as_mobile_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user enters {string} as WhatsApp Number")
    public void the_user_enters_as_whats_app_number(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user clicks on Subject Preference Session")
    public void the_user_clicks_on_subject_preference_session() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user selects Science as Subject")
    public void the_user_selects_science_as_subject() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user enters the preferences")
    public void the_user_enters_the_preferences() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user enters {string} as Score Percentage")
    public void the_user_enters_as_score_percentage(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The user clicks the Submit button")
    public void the_user_clicks_the_submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
