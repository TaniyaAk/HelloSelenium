package com.taniya.tests;

import com.taniya.pages.BasePage;
import com.taniya.pages.CheckoutPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class CheckoutPageTest extends AddToCartTest {
    {
    }

    @Test
    public void checkoutPageTest() throws InterruptedException {
        System.out.println("This is a test");
//        addToCartTest();
        checkoutPage.checkoutPage();
    }

}