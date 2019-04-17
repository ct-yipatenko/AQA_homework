package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private WebDriver driver;
    private App mainPage;

    @Before
    public void setUp() {
        String os = System.getProperty("os.name").toLowerCase();

        WebDriver driver = new ChromeDriver();

        if (os.contains("mac")) {

            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        } else {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
        }
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        this.driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        this.mainPage = new App(this.driver);
    }

    @Test
    public void canRegister() {
        Assert.assertTrue(
                mainPage.openMainPage()
                        .openSignInPage()
                        .inputValidMail()
                        .createAccountClick()
                        .fillForm()
                        .register()
                        .errorCheck());
    }


    @After
    public void cleanup(){
//        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
