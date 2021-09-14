package com.taniya.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage extends BasePage {
    //protected String LoginPageTest = "";
    //input[@id='password']


    //Create a Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    //WebElements
    @FindBy(xpath = "//a[@href ='/login']")
    WebElement loginBtnTwo;
    @FindBy(xpath = "//input[@id='username']")
    WebElement registerEmailInputTwo;
    @FindBy(xpath = "(//*[@id='password'])[1]")
    WebElement enterPasswordTwo;
    @FindBy(className = "check")
    WebElement rememberMeInput;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    WebElement loginButtonTwo;


    public void loginPage() throws InterruptedException {
//        clickOnElement(loginBtnTwo);
        textInput(registerEmailInputTwo, email);
        textInput(enterPasswordTwo, "PW1234");
        clickOnElement(rememberMeInput);
        clickOnElement(loginButtonTwo);
        Thread.sleep(1000);
    }
}
