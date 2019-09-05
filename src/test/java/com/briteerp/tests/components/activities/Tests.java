package com.briteerp.tests.components.activities;

import com.briteerp.utilities.*;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public  class Tests extends TestBase{

    Pages pages = new Pages();


    @Test
    public void priceTest(){
        pages.loginPage().login();
        BrowserUtils.waitPlease(2);
        pages.pricePage().run();
        BrowserUtils.waitPlease(2);
        pages.amountPage().run2();
    }


}
