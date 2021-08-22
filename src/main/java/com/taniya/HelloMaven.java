package com.taniya;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloMaven {
    public static void main(String[] args) throws InterruptedException {


        System.out.println("Laughing is the best medicine");

        System.setProperty("webdriver.gecko.driver","C:\\Users\\19176\\Desktop\\driver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("https://finance.yahoo.com/quote/ANY?p=ANY&.tsrc=fin-srch");
        Thread.sleep(2000);

        System.out.println("But if you're laughing for no reason....");
        System.out.println("you may need medicine");

        driver.quit();

    }
}
