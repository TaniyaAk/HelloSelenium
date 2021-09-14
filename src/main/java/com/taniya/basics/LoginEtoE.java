package com.taniya.basics;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

//inheritance usage. LoginEtoE is getting methods and variables from RegisterSauce class
public class LoginEtoE extends RegisterSauce {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Laughing is the best medicine");
       registerPage();
        WebDriver driver = webDriverSetup("chrome");

        seleniumWait();

        WebElement passInput = driver.findElement(By.id("password"));
        WebElement checkBoxInput = driver.findElement(By.className("check"));
        WebElement rememberMeInput = driver.findElement(By.xpath("//label[@for='remember-me-check']"));
        List<WebElement> loginButtonInput = driver.findElements(By.xpath("//button[@type='submit']"));
        WebElement loginButton = loginButtonInput.get(1);
        // Creating action class object so we can move the mouse to the element to see add to cart object
        WebElement hsPic = driver.findElement(By.xpath("//div[@class='js-image image card-image']"));
        WebElement greenGhostAddCart = driver.findElement(By.xpath("(//button[@class='btn btn-primary btn-xs hidden-xs btn-add-to-cart js-addToCart'])[4]"));
// Since add to cart is a javascript object, it cannot be accessed using selenium driver
        WebElement cart = driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']"));
        WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        WebElement fullName = driver.findElement(By.id("fullName"));
        WebElement addressOne = driver.findElement(By.id("addressLine1"));
        WebElement addressTwo = driver.findElement(By.id("addressLine2"));
        WebElement city = driver.findElement(By.id("city"));
        WebElement state = driver.findElement(By.id("stateProvinceRegion"));
        WebElement postalCode = driver.findElement(By.id("postalCode"));
        WebElement phoneNumber = driver.findElement(By.id("phonePrimary"));
        WebElement checkBox = driver.findElement(By.className("checkbox-material"));
        WebElement radio1 = driver.findElement(By.xpath("//label[normalize-space()='Standard (5 - 7 Days)']"));
        WebElement continueBtn = driver.findElement(By.xpath("(//a[@href='#'] )[5]"));
        WebElement creditCard = driver.findElement(By.xpath("//a[@href='#CreditCard']"));
        WebElement cardNumber = driver.findElement(By.id("cardNumber"));
        WebElement CVV = driver.findElement(By.id("securityCode"));
        WebElement expDate = driver.findElement(By.id("cardExpDate"));
        WebElement saveTheCard = driver.findElement(By.xpath("(//*[@class='check'] )[1]"));
        WebElement continueBtnInput = driver.findElement(By.xpath("(//i[@class='material-icons'] )[7]"));
        WebElement placeOrder = driver.findElement(By.xpath("(//a[@class='btn btn-primary pull-right js-performCheckout'])[1]"));



        Thread.sleep(3000);
        WebElement loginBtn = driver.findElement(By.xpath("//a[@href ='/login']"));
        loginBtn.click();
        WebElement loginEmailInput = driver.findElement(By.xpath("//input[@id='username']"));

        loginEmailInput.sendKeys("akt@me.com");
        passInput.sendKeys("abcdef0704");
        checkBoxInput.click();
        rememberMeInput.click();
        loginButton.click();
        Actions action = new Actions(driver);
        action.moveToElement(hsPic);
        // you will have to cast javascript executor to the driver to access the object and perform an action
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", greenGhostAddCart);
        cart.click();
        checkout.click();
        fullName.sendKeys("Taniya Akt");
        addressOne.sendKeys("100 Gold St");
        addressTwo.sendKeys("6B");
        city.sendKeys("Brooklyn");
        state.sendKeys("NY");
        postalCode.sendKeys("10038");
        phoneNumber.sendKeys("718-972-5489");
        checkBox.click();
        radio1.click();
        continueBtn.click();
        creditCard.click();
        cardNumber.clear();
        cardNumber.sendKeys("22222222222");
        CVV.clear();
        CVV.sendKeys("302");
        expDate.clear();
        expDate.sendKeys("04/23");
        saveTheCard.click();
        continueBtnInput.click();
        placeOrder.click();


        // Creating action class object so we can move the mouse to the element to see add to cart object

//        WebElement shippingMethod = driver.findElement(By.id("fulfillmentOptionId3"));
//        js.executeScript("arguments[0].click();", shippingMethod);
//        Thread.sleep(2000);

//        WebElement shippingMethod = driver.findElement(By.xpath("//*[@id='fulfillmentOptionId1']"));
        //js.executeScript("arguments[0].click();", shippingMethod);
       // shippingMethod.click();
       // Thread.sleep(2000);

//        WebElement shippingMethod = driver.findElement(By.id("'fulfillmentOptionId1']"));
//        //js.executeScript("arguments[0].click();", shippingMethod);
//        shippingMethod.click();
//        Thread.sleep(2000);


        //WebElement sameShippingAddress = driver.findElement(By.id("shouldUseShippingAddress1"));
        //js.executeScript("arguments[0].click();", sameShippingAddress);
        //Thread.sleep(1500);






        driver.quit();
        //driver.close();
    }

    private static void clickElement(WebElement element) {
        element.click();
    }


    public static void seleniumWait() throws InterruptedException {
        Thread.sleep(3000);
    }

    }



