package StepDefinition;
import Hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjects.LoginPage;

public class stepDefinitionLogin {

    LoginPage lp = new LoginPage(Hooks.driver) ;

    @Given("user navigate to login page")
    public void user_navigate_to_login_page() {
        System.out.println("Navigating to loginPage and clicks on Sigin Button");
//        LoginPage lp = new LoginPage(Hooks.driver) ;
        lp.clickSignIn();
    }
    @When("user enters valid username as {string} and password as {string}")
    public void user_enters_valid_username_as_and_password_as(String stringemail, String stringPassword) {
        System.out.println("Entering login details");
        lp.inputEmail(stringemail);
        lp.inputPassword(stringPassword);
    }
    @And("user clicks on Sign in Now Button")
    public void user_clicks_on_sign_in_now_button() {
        System.out.println("User clicks on Sign in Button");
        lp.clickBtnSignIn();
    }
    @Then("Validate the user can see the profile creation page")
    public void validate_the_user_can_see_the_profile_creation_page() {
        System.out.println("Profile validation is taking place");

        System.out.println(lp.chatBoxTextValidation());
//        Assert.assertEquals(lp.chatBoxTextValidation(), "What is your full name?");
        Assert.assertTrue(
                "Validation failed: Expected text not found!",
                lp.chatBoxTextValidation().contains("What is your full name?")
        );
        System.out.println("User login successfully");

    }

}
