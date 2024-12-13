package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Hooks
{
    public static WebDriver driver;

    @Before
    public void setup()
    {
// initializeBrowser();
//        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
        driver.get("https://qaweb.gyansetu.ai/");
        driver.manage().window().maximize();

    }

    @After
    public void tearDown()
    {
        if (driver != null)
        {
            driver.quit();
        }
    }
}
