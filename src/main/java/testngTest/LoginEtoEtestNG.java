package testngTest;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

//inheritance usage. LoginEtoE is getting methods and variables from RegisterSauce class
public class LoginEtoEtestNG extends BaseSetup {

    WebDriver driver;
    String email = "abc@xyz.com";
    String url = "https://demo.broadleafcommerce.org";

    //The annotated method will be run before each test method.
    @BeforeMethod()
    public void getUrl() {
        driver = webDriverSetup("chrome");
        driver.get(url);
        //Assert.assertEquals(driver.getTitle(),expectedRegText);

        WebElement loginBtn = driver.findElement(By.xpath("//a[@href ='/login']"));
        loginBtn.click();
    }

    @Test(priority = 1)
    public void registerPage() throws InterruptedException {
//        System.out.println("Laughing is the best medicine");
        //System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Broadleaf Commerce Demo Store - Heat Clinic - Login");
        //Assert.assertEquals(driver.getTitle(),"Broadleaf Commerce Demo Store - Heat Clinic - Loginooooo");
        WebElement registerEmailInput = driver.findElement(By.xpath("//input[@id='customer.emailAddress']"));

        // Thread.sleep(100);
        registerEmailInput.sendKeys(email);
        WebElement firstNameInput = driver.findElement(By.id("customer.firstName"));
        // Thread.sleep(100);
        firstNameInput.sendKeys("Awesome");

        WebElement lastNameInput = driver.findElement(By.name("customer.lastName"));
        Thread.sleep(100);
        lastNameInput.sendKeys("Taniya");

        // If there are multiple elements for the same locators, so you need to save it
        // in a LIST and use findElement(s) instead of findElement
        // Multiple locators use indexes to save the value in list.
        // To get the second element you need to use get method and put the index number
        // in the parameter 2nd element = index 1.

        List<WebElement> passList = driver.findElements(By.id("password"));
        WebElement passwordInput = passList.get(1);
        Thread.sleep(100);
        passwordInput.sendKeys("abcdef0704");

        WebElement conPasswordInput = driver.findElement(By.id("passwordConfirm"));
        Thread.sleep(100);
        conPasswordInput.sendKeys("abcdef0704");

        List<WebElement> submitList = driver.findElements(By.xpath("//button[@type='submit']"));
        WebElement registerBtn = submitList.get(2);
        Thread.sleep(100);
        registerBtn.click();
        Thread.sleep(3000);

    }

    @Test(priority = 2)
    public void endToEnd() throws InterruptedException, IOException {

        // LOGIN IN
        WebElement loginEmailInput = driver.findElement(By.xpath("//input[@id='username']"));
        // Thread.sleep(100);
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
        //Assert.assertEquals();


        // Creating action class object so we can move the mouse to the element to see add to cart object
        Actions action = new Actions(driver);
        WebElement hsPic = driver.findElement(By.xpath("//div[@class=\"js-image image card-image\"]"));
        action.moveToElement(hsPic);
        Thread.sleep(20);

        WebElement greenGhostAddCart = driver.findElement(By.xpath("(//button[@class=\"btn btn-primary btn-xs hidden-xs btn-add-to-cart js-addToCart\"])[4]"));
        Thread.sleep(200);

        /*
         * Since add to cart is a javascript object, it cannot be accessed using
         * selenium driver. you will have to cast javascript executor to the driver to
         * access the object and perform an action
         */
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", greenGhostAddCart);
        Thread.sleep(2000);

        WebElement cart = driver.findElement(By.xpath("//a[@class='btn btn-primary goto-full-cart']"));
        cart.click();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Broadleaf Commerce Demo Store - Heat Clinic - Cart");


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

        WebElement placeOrder = driver
                .findElement(By.xpath("(//a[@class=\"btn btn-primary pull-right js-performCheckout\"])[1]"));
        placeOrder.click();
        Thread.sleep(100);
        Assert.assertTrue(driver.getTitle().contains("Order Confirmation"));

    }

    @AfterMethod
    public void closeDriver() {
        driver.quit();
    }

}
