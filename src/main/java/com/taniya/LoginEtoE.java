package com.taniya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

//inheritance usage. LoginEtoE is getting methods and variables from RegisterSauce class
public class LoginEtoE extends RegisterSauce {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Laughing is the best medicine");
        registerPage();
        WebDriver driver = webDriverSetup("chrome");

        //driver.get("https://finance.yahoo.com/quote/ANY?p=ANY&.tsrc=fin-srch");
        driver.get("https://demo.broadleafcommerce.org/");
        WebElement loginBtn = driver.findElement(By.xpath("//a[@href ='/login']"));
        //Thread.sleep(100);
        loginBtn.click();

        //LOGIN IN
        WebElement loginEmailInput = driver.findElement(By.xpath("//input[@id='username']"));
        //Thread.sleep(100);
        loginEmailInput.sendKeys(email);


        WebElement passInput = driver.findElement(By.id("password"));
        // Thread.sleep(100);
        passInput.sendKeys("abcdef0704");

        WebElement checkBoxInput = driver.findElement(By.className("check"));
        // Thread.sleep(100);
        checkBoxInput.click();

        WebElement rememberMeInput = driver.findElement(By.xpath("//label[@for='remember-me-check']"));
        Thread.sleep(2000);
        rememberMeInput.click();

        List<WebElement> loginButtonInput = driver.findElements(By.xpath("//button[@type='submit']"));
        WebElement loginButton = loginButtonInput.get(1);
        Thread.sleep(2000);
        loginButton.click();

        // Creating action class object so we can move the mouse to the element to see add to cart object
        Actions action = new Actions(driver);
        WebElement hsPic = driver.findElement(By.xpath("//div[@class=\"js-image image card-image\"]"));
        action.moveToElement(hsPic);
        Thread.sleep(20);

        WebElement greenGhostAddCart = driver.findElement(By.xpath("(//button[@class=\"btn btn-primary btn-xs hidden-xs btn-add-to-cart js-addToCart\"])[4]"));
        Thread.sleep(200);

        // Since add to cart is a javascript object, it cannot be accessed using selenium driver
        // you will have to cast javascript executor to the driver to access the object and perform an action
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", greenGhostAddCart);
        Thread.sleep(2000);

        WebElement cart = driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']"));
        cart.click();

        WebElement checkout = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
        checkout.click();
        Thread.sleep(200);

        WebElement fullName = driver.findElement(By.id("fullName"));
        fullName.sendKeys("Taniya Akt");
        Thread.sleep(200);

        WebElement addressOne = driver.findElement(By.id("addressLine1"));
        addressOne.sendKeys("100 Gold St");
        Thread.sleep(200);

        WebElement addressTwo = driver.findElement(By.id("addressLine2"));
        addressTwo.sendKeys("6B");
        Thread.sleep(200);

        WebElement city = driver.findElement(By.id("city"));
        city.sendKeys("Brooklyn");
        Thread.sleep(200);

        WebElement state = driver.findElement(By.id("stateProvinceRegion"));
        state.sendKeys("NY");
        Thread.sleep(200);

        WebElement postalCode = driver.findElement(By.id("postalCode"));
        postalCode.sendKeys("10038");
        Thread.sleep(200);

        WebElement phoneNumber = driver.findElement(By.id("phonePrimary"));
        phoneNumber.sendKeys("718-972-5489");
        Thread.sleep(200);

        WebElement checkBox = driver.findElement(By.className("checkbox-material"));
        checkBox.click();
        Thread.sleep(200);


        // Creating action class object so we can move the mouse to the element to see add to cart object

        WebElement shippingMethod = driver.findElement(By.id("fulfillmentOptionId3"));

        js.executeScript("arguments[0].click();", shippingMethod);
        Thread.sleep(100);


        WebElement continueBtn = driver.findElement(By.xpath("(//a[@href='#'] )[5]"));
        continueBtn.click();
        Thread.sleep(100);


        WebElement sameShippingAddress = driver.findElement(By.id("shouldUseShippingAddress1"));
        js.executeScript("arguments[0].click();", sameShippingAddress);
        Thread.sleep(1500);

        WebElement creditCard = driver.findElement(By.xpath("//a[@href='#CreditCard']"));
        creditCard.click();
        Thread.sleep(100);

        WebElement cardNumber = driver.findElement(By.id("cardNumber"));
        cardNumber.clear();
        cardNumber.sendKeys("22222222222");
        Thread.sleep(100);

        WebElement CVV = driver.findElement(By.id("securityCode"));
        CVV.clear();
        CVV.sendKeys("302");
        Thread.sleep(100);

        WebElement expDate = driver.findElement(By.id("cardExpDate"));
        expDate.clear();
        expDate.sendKeys("04/23");
        Thread.sleep(100);


        WebElement saveTheCard = driver.findElement(By.xpath("(//*[@class=\"check\"] )[1]"));
        saveTheCard.click();
        Thread.sleep(100);


        WebElement continueBtnInput = driver.findElement(By.xpath("(//i[@class='material-icons'] )[7]"));
        continueBtnInput.click();
        Thread.sleep(2000);

        WebElement placeOrder = driver.findElement(By.xpath("(//a[@class=\"btn btn-primary pull-right js-performCheckout\"])[1]"));
        placeOrder.click();
        Thread.sleep(100);


        driver.quit();
        //driver.close();
    }
}

