package com.taniya.tests;

import org.testng.annotations.Test;

public class RegistrationPageTest extends BasePageTest {

    @Test
    public void registrationTest() throws InterruptedException {
        System.out.println("This is Heat Clinic");
        registrationPage.registerAccount();
    }

}

