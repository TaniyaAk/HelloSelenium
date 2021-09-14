package com.taniya.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BillingShippingInforPage extends BasePage {
    public BillingShippingInforPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    //WebElements
    @FindBy(id = "shouldUseShippingAddress1")
    WebElement elementSameShippingAddress;
    @FindBy(xpath = "//a[@href='#CreditCard']")
    WebElement elementCreditCard;
    @FindBy(id = "cardNumber")
    WebElement elementCardNumber;
    @FindBy(id = "securityCode")
    WebElement elementSecurityCode;
    @FindBy(id = "cardExpDate")
    WebElement elementCardExpDate;
    @FindBy(xpath = "(//*[@class='check'])[2]")
    WebElement elementSaveTheCard;
    @FindBy(xpath = "(//i[@class='material-icons'])[7]")
    WebElement elementContinueBtnInput;
    @FindBy(xpath = "(//a[@class='btn btn-primary pull-right js-performCheckout'])[1]")
    WebElement elementPlaceOrder;


    //created method here

    public void billingShippingInforPage() throws InterruptedException {
        javascriptExecutorsClick(elementSameShippingAddress);
        clickOnElement(elementCreditCard);
        elementCardNumber.clear();
        textInput(elementCardNumber, "22222222222");
        elementSecurityCode.clear();
        textInput(elementSecurityCode, "302");
        elementCardExpDate.clear();
        textInput(elementCardExpDate, "04/23");
        clickOnElement(elementSaveTheCard);
        clickOnElement(elementContinueBtnInput);
        Thread.sleep(5000);
        clickOnElement(elementPlaceOrder);
    }
}

