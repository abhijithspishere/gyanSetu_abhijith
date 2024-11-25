package StepDefinition;

import Hooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.HomePage;

public class stepdefinitionSignup {


       @Given("User navigate to signup page")
        public void user_navigate_to_signup_page() {
            System.out.println("Navigating to signup page...");
        }

        @When("User enters signup details")
            public void user_enters_signup_details() throws InterruptedException {
            HomePage hp = new HomePage(Hooks.driver);
            hp.clickRegister_btn();
            hp.setEmail("swathy33@gmail.com");
            hp.setTxtPassword("Swath@344");
            hp.clickTandC();
            hp.clickSignUpNow();
        }


    }


