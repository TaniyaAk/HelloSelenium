package com.taniya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    //WebElements
    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement elementCheckoutOne;
    @FindBy(xpath = "//*[@id='fullName']")
    WebElement elementFullName;
    @FindBy(id = "addressLine1")
    WebElement elementAddressOne;
    @FindBy(id = "addressLine2")
    WebElement elementAddressTwo;
    @FindBy(id = "city")
    WebElement elementCity;
    @FindBy(id = "stateProvinceRegion")
    WebElement elementState;
    @FindBy(id = "postalCode")
    WebElement elementPostalCode;
    @FindBy(id = "phonePrimary")
    WebElement elementPhoneNumber;
    @FindBy(xpath = "//*[@id='shippingInfo']/div/div[1]/div/div/div[5]/div/div")
    WebElement elementCheckBox;
    @FindBy(id = "fulfillmentOptionId1")
    WebElement elementShippingMethod;
    @FindBy(xpath = "//a[@class='btn btn-primary pull-right js-submitCheckoutStage'] ")
    WebElement elementCheckoutTwo;


    public void checkoutPage() throws InterruptedException {
        clickOnElement(elementCheckoutOne);
        textInput(elementFullName, "Awesome Taniya");
        textInput(elementAddressOne, "243 Gold St");
        textInput(elementAddressTwo, "13B");
        textInput(elementCity, "Brooklyn");
        textInput(elementState, "NY");
        textInput(elementPostalCode, "11201");
        textInput(elementPhoneNumber, "800-222-2000");
        clickOnElement(elementCheckBox);
        javascriptExecutorsClick(elementShippingMethod);
        clickOnElement(elementCheckoutTwo);
        Thread.sleep(20000);

    }
}
