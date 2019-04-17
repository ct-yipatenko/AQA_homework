package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.jvm.hotspot.utilities.Assert;

import java.util.Random;

/**
 * Hello world!
 */
public class App {
    private static final String MAIN_PAGE_URL ="http://automationpractice.com";
    private WebDriver driver;
    private Random randomGenerator = new Random();
    private int randomInt = randomGenerator.nextInt(1000);

    private By sighInTab = By.xpath("//*[@id='header']/div[2]/div/div/nav/div/a");
    private By sizeLcheckbox = By.id("layered_id_attribute_group_3");
    private By emailCreate = By.cssSelector("#email_create");
    private By createAccount = By.id("SubmitCreate");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By passwd = By.id("passwd");
    private By address1 = By.id("address1");
    private By city = By.id("city");
    private By phone = By.id("phone");
    private By center = By.id("center_column");
    private By register = By.id("submitAccount");

    public App(WebDriver driver) {
        this.driver = driver;
    }

    public App openMainPage(){
        this.driver.navigate().to(MAIN_PAGE_URL);
        return this;
    }

    public App openSignInPage(){
        this.driver.findElement(sighInTab).click();
        return this;
    }

    public App inputValidMail(){
        this.driver.findElement(emailCreate).sendKeys("username"+ randomInt +"@gmail.com");
        return this;
    }

    public App createAccountClick(){
        this.driver.findElement(createAccount).click();
        return this;
    }

    public App fillForm(){
        this.driver.findElement(firstName).sendKeys("dummy");
        this.driver.findElement(lastName).sendKeys("dummy");
        this.driver.findElement(passwd).sendKeys("dummy");
        this.driver.findElement(address1).sendKeys("dummny");
        this.driver.findElement(city).sendKeys("dummy");
        this.driver.findElement(phone).sendKeys("dummy");
        return this;
    }

    public App register(){
        this.driver.findElement(register).click();
        return this;
    }

    public boolean errorCheck(){
       return this.driver.findElement(center).getText().contains("There are 3 errors");
    }

//    public App selectSizeL(){
//        this.driver.findElement(sizeLcheckbox).click();
//        return this;
//    }

//    public boolean isSizeL(){
//        return this.driver.findElement(sizeLcheckbox).isSelected();
//    }
}
