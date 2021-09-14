package com.testngparam.frameworks;

import com.taniya.tests.BasePageTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterationPageParamOneTest extends BasePageTest {



    @Parameters( {"email", "firstName","lastName" })
    @Test
    public void registrationPageParamOneTest(String email,String firstName, String lastName) throws InterruptedException {
        registrationPageParamOne.registerAccount(email,firstName,lastName);
    }
}
