package com.testngparam.frameworks;

import com.taniya.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegistrationPageParamOne extends BasePage {
    //Create a Constructor
    public RegistrationPageParamOne(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    //WebElements
    @FindBy(xpath = "//a[@href ='/login']")
    WebElement loginBtnOne;
    @FindBy(xpath = "//input[@id='customer.emailAddress']")
    WebElement registerEmailInputOne;
    @FindBy(id = "customer.firstName")
    WebElement firstNameInput;
    @FindBy(id = "customer.lastName")
    WebElement lastNameInput;
    @FindBy(xpath = "(//*[@id='password'])[2]")
    WebElement enterPasswordOne;
    @FindBy(xpath = "//*[@id='passwordConfirm']")
    WebElement confirmPassword;
    @FindBy(xpath = "//*[@id='registrationForm']/button")
    WebElement registerButton;
    @FindBy(xpath = "//*[@id='sectionsNav']/div/div[1]/ul[2]/li[1]/a")
    WebElement userNameText;

    public void registerAccount(String email, String firstName, String lastName) throws InterruptedException {
        clickOnElement(loginBtnOne);
        textInput(registerEmailInputOne, email);
        textInput(firstNameInput, firstName);
        textInput(lastNameInput, lastName);
        textInput(enterPasswordOne, "PW1234");
        textInput(confirmPassword, "PW1234");
        clickOnElement(registerEmailInputOne);
        clickOnElement(registerButton);
        Thread.sleep(1000);
        System.out.println("Actual text: " + userNameText.getText());
//        Assert.assertTrue(userNameText.getText().toLowerCase().contains("firstName"));
    }

}