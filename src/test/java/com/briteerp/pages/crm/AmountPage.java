package com.briteerp.pages.crm;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class AmountPage {
    public AmountPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='oe_menu_text'and contains(text(),'CRM')]")
    public WebElement CrmButton;
    @FindBy(xpath = "//button[@class='btn btn-icon fa fa-lg fa-table o_cp_switch_pivot active']")
    public WebElement PivotButton;
    @FindBy(xpath = "//td[@class='o_pivot_header_cell_closed']")
    public WebElement newButton;


    public void run2() {
        Driver.getDriver().manage().timeouts().implicitlyWait(Long.valueOf(ConfigurationReader.getProperty("implicitwait")), TimeUnit.SECONDS);
//        CrmButton.click();
//        PivotButton.click();
//        newButton.click();
//
//        Select a = new Select(newButton);
//        a.selectByVisibleText("Opportunity");

        int expectedTotal=0;
        for(int i=3;i<=6;i++){
            WebElement table = Driver.getDriver().findElement(By.xpath("//table[1]/tbody/tr[" +i+ "]/td[2]"));
            int countTotal = Integer.parseInt(table.getText().replaceAll("[^\\d]",""));
            expectedTotal+=countTotal;
        }
        System.out.println("expectedTotal"+expectedTotal);

         WebElement actualTotal =  Driver.getDriver().findElement(By.xpath("//tr[1]//td[2]"));
         int totalNumber = Integer.parseInt(actualTotal.getText().replaceAll("[^\\d]",""));

         Assert.assertEquals(totalNumber,expectedTotal);



    }
}