package StepDefinition;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

public class stepdefinitionSignup {

    HomePage hp;

       @Given("User navigate to signup page")
        public void user_navigate_to_signup_page() {
           System.out.println("Navigating to signup page...");
           hp = new HomePage(Hooks.driver);
        }

    @When("User enters valid {string} and {string}")
    public void userEntersValidAnd(String username, String password ) throws InterruptedException {
        System.out.println("Entering Signup details");
        hp = new HomePage(Hooks.driver);
        hp.clickRegister_btn();
        hp.setEmail(username);
        hp.setTxtPassword(password);
        hp.clickTandC();
    }

    @Then("user should be able to see User created successfully")
    public void user_should_be_able_to_see_user_created_successfully() throws InterruptedException {
           hp.clickSignUpNow();
//           hp.fetchValidate();

    }


}


