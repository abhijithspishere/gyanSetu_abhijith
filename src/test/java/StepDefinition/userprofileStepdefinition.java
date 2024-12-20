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


    @And("The user selects as Country")
    public void theUserSelectsAsCountry() {
        up.select_Country();
    }

    @When("The user selects {string} as Country")
    public void the_user_selects_as_country(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as State")
    public void the_user_selects_as_state(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user enters {string} as City")
    public void the_user_enters_as_city(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user enters {string} as District")
    public void the_user_enters_as_district(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user enters {string} as Pincode")
    public void the_user_enters_as_pincode(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The current address should be filled successfully")
    public void the_current_address_should_be_filled_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user has filled the current address")
    public void the_user_has_filled_the_current_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} for permanent address")
    public void the_user_selects_for_permanent_address(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should be navigated to the Hobbies\\/Languages section")
    public void the_user_should_be_navigated_to_the_hobbies_languages_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user enters {string} as Permanent Address {int}")
    public void the_user_enters_as_permanent_address(String string, Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as Permanent Country")
    public void the_user_selects_as_permanent_country(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as Permanent State")
    public void the_user_selects_as_permanent_state(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user enters {string} as Permanent City")
    public void the_user_enters_as_permanent_city(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user enters {string} as Permanent District")
    public void the_user_enters_as_permanent_district(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user enters {string} as Permanent Pincode")
    public void the_user_enters_as_permanent_pincode(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user is on the Hobbies\\/Languages section")
    public void the_user_is_on_the_hobbies_languages_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
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

    @When("The user selects {string} as Proficiency")
    public void the_user_selects_as_proficiency(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should be navigated to the Academic History section")
    public void the_user_should_be_navigated_to_the_academic_history_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user is on the Academic History section")
    public void the_user_is_on_the_academic_history_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as School")
    public void the_user_selects_as_school(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as Board")
    public void the_user_selects_as_board(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as Class")
    public void the_user_selects_as_class(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The user should be navigated to the Contact Details section")
    public void the_user_should_be_navigated_to_the_contact_details_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user is on the Contact Details section")
    public void the_user_is_on_the_contact_details_section() {
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

    @Then("The user should be navigated to the Subject Preferences section")
    public void the_user_should_be_navigated_to_the_subject_preferences_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("The user is on the Subject Preferences section")
    public void the_user_is_on_the_subject_preferences_section() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as Course")
    public void the_user_selects_as_course(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as Semester")
    public void the_user_selects_as_semester(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The user selects {string} as Subject")
    public void the_user_selects_as_subject(String string) {
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

    @Then("The user profile completion should be successful")
    public void the_user_profile_completion_should_be_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
