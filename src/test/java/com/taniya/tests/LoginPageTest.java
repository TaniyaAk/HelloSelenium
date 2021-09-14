package com.taniya.tests;

import com.taniya.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends BasePageTest {

    @Test
    public void loginTest() throws InterruptedException {
        System.out.println("This is a test");
        loginPage.loginPage();
    }

}
