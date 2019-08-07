package com.briteerp.pages.login_navigation;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
@FindBy(xpath="//b[contains(text(),'Sign in')]")
public WebElement sighInButton;
@FindBy(id="login")
    public WebElement email;
@FindBy(id="password")
    public WebElement pwd;
@FindBy(xpath="//button[@class='btn btn-primary'] ")
public WebElement logInButton;





    public void login() {
        sighInButton.click();
        email.sendKeys(ConfigurationReader.getProperty("email"));
        pwd.sendKeys(ConfigurationReader.getProperty("pwd"));
        logInButton.click();
        String expectedtitle = Driver.getDriver().getTitle();
        String actualtitle = "Odoo";
        Assert.assertEquals(expectedtitle,actualtitle);
    }



}
