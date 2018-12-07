package com.acme.qa.base;

import com.wiley.basetests.SeleniumBaseTest;
import com.wiley.driver.WebDriverFactory;
import com.wiley.holders.DriverHolder;
import org.testng.annotations.BeforeSuite;

public class UiBaseTest extends SeleniumBaseTest {

    @BeforeSuite
    public void prepareWebDriver() {
        WebDriverFactory.initDriver();
        DriverHolder.getDriver().manage().window().maximize();
    }

}