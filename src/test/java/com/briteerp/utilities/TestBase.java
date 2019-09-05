package com.briteerp.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public  class TestBase {
    protected WebDriver driver;
    protected Actions action;
    protected Pages pages;

    @BeforeMethod
    public void setup(){
        driver = Driver.getDriver();
        action = new Actions(driver); //poli
        driver.manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigurationReader.getProperty("url"));

    }

    @AfterClass
    public void tearDown(){
        driver.close();
}


}
