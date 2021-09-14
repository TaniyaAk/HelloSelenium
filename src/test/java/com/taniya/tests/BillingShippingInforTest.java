package com.taniya.tests;

import com.taniya.pages.BillingShippingInforPage;
import org.testng.annotations.Test;

public class BillingShippingInforTest extends CheckoutPageTest {

    @Test
    public void billingShippingInforTest() throws InterruptedException {
        System.out.println("Created end to end tests for the whole checkout process");
//        checkoutPageTest();
        billingShippingInforPage.billingShippingInforPage();

    }
}
    