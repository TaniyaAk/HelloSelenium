package com.taniya;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class RegisterSauce {
    static String email = "allgood@me.com";

    public static void registerPage() throws InterruptedException {
        System.out.println("Laughing is the best medicine");
        WebDriver driver = webDriverSetup("chrome");

        driver.get("https://demo.broadleafcommerce.org/");
        WebElement loginBtn = driver.findElement(By.xpath("//a[@href ='/login']"));
        //Thread.sleep(100);
        loginBtn.click();
        // Thread.sleep(100);

        WebElement registerEmailInput = driver.findElement(By.xpath("//input[@id='customer.emailAddress']"));

        // Thread.sleep(100);
        registerEmailInput.sendKeys(email);

        WebElement firstNameInput = driver.findElement(By.id("customer.firstName"));
        //Thread.sleep(100);
        firstNameInput.sendKeys("Awesome");


        WebElement lastNameInput = driver.findElement(By.name("customer.lastName"));
        Thread.sleep(100);
        lastNameInput.sendKeys("Taniya");

        //If there are multiple elements for the same locators, so you need to save it in a LIST and use findElement(s) instead of findElement
        //Multiple locators use indexes to save the value in list.
        // To get the second element you need to use get method and put the index number in the parameter 2nd element = index 1.

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
        driver.quit();
    }

    public static WebDriver webDriverSetup(String browser) {
        WebDriver driver = null;
        if (browser.equals("chrome")) {
            // WebDriverManager.firefoxdriver().setup();
            WebDriverManager.chromedriver().setup();

            //WebDriver driver = new FirefoxDriver();
            driver = new ChromeDriver();

        }
        if (browser.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();

        //driver.manage().window().fullscreen();
        WebDriverManager.chromedriver().clearDriverCache();
        return driver;
    }


}

