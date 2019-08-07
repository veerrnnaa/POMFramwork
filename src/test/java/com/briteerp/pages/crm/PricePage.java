package com.briteerp.pages.crm;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class PricePage  {
    public PricePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath="//span[@class='oe_menu_text'and contains(text(),'CRM')]")
    public WebElement CrmButton;
    @FindBy(xpath ="//button[@type='button' and @aria-label='pivot']")
    public WebElement PivotButton;
    @FindBy(xpath = "//td[@class='o_pivot_header_cell_closed']")
    public WebElement newButton;
    @FindBy(xpath = "//a[text()='Opportunity']")
    public WebElement Opportunity;
    @FindBy(xpath="//table[1]/tbody/tr[4]/td[2]")
    public WebElement actualPrice;
    @FindBy(xpath="//table[1]/tbody[1]/tr[2]/td[9]")
    public WebElement expectedPrice;
    @FindBy(xpath = "//button[@aria-label='list']")
    public WebElement listButton;




    public void run(){
        BrowserUtils.waitPlease(2);
        Driver.getDriver().manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
        CrmButton.click();
        BrowserUtils.waitPlease(2);
        listButton.click();
        BrowserUtils.waitPlease(2);
        String price2= expectedPrice .getText();
        PivotButton.click();
        BrowserUtils.waitPlease(2);
        newButton.click();
        BrowserUtils.waitPlease(2);
        Opportunity.click();
        BrowserUtils.waitPlease(2);
        String price1= actualPrice.getText();


        Assert.assertEquals(price1,price2);

    }



}
