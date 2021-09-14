package com.taniya.tests;

import com.taniya.pages.BasePage;
import org.testng.annotations.Test;

public class EndToEndTest extends BasePageTest {
    @Test(priority = 1)
    public void registrationTest() throws InterruptedException {
        System.out.println("This is Heat Clinic");
        registrationPage.registerAccount();
    }
//    @Test(priority = 2)
//    public void loginTest() throws InterruptedException {
//        System.out.println("This is a test");
//        loginPage.loginPage();
//    }

    @Test(priority = 2)
    public void addToCartTest() throws InterruptedException {
        System.out.println("Adding Hot Sauce");
//        loginTest();
        addToCartPage.addtoCart();
    }


    @Test(priority = 3)
    public void checkoutPageTest() throws InterruptedException {
        System.out.println("This is a test");
        //addToCartTest();
        checkoutPage.checkoutPage();
    }

    @Test(priority = 4)
    public void billingShippingInforTest() throws InterruptedException {
        System.out.println("Created end to end tests for the whole checkout process");
//        checkoutPageTest();
        billingShippingInforPage.billingShippingInforPage();

    }
}
