package com.taniya.tests;

import org.testng.annotations.Test;

public class AddToCartTest extends LoginPageTest {

    @Test
    public void addToCartTest() throws InterruptedException {
        System.out.println("Adding Hot Sauce");
//        loginTest();
        addToCartPage.addtoCart();
    }
}
