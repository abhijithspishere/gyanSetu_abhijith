package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.LoginPage;
import pageObjects.User_Profile;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;
    LoginPage loginpage;
    User_Profile up;
    @Before(order = 0)
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        // Initialize LoginPage after WebDriver setup
        loginpage = new LoginPage(driver);
         up = new User_Profile(Hooks.driver);
    }

    @Before(order = 1)
    public void globalSignin() throws InterruptedException {
        driver.get("https://qaweb.gyansetu.ai/");
        loginpage.clickSignIn();
        loginpage.inputEmail("aiswarya@gmail.com");
        loginpage.inputPassword("Xtreme@1");
        loginpage.clickBtnSignIn();

        Assert.assertTrue(
                "Validation failed: Expected text not found!",
                loginpage.chatBoxTextValidation().contains("What is your full name?")
        );
        System.out.println("User login successfully");
//
        up.profileClose();
        up.Closechat();
        up.click_ProfileDrop();
        up.click_Profile();
    }

    }

   /* @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }*/

