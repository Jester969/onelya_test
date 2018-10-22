package ru.onelya.qa.elements;

import com.wiley.elements.SearchStrategy;
import com.wiley.holders.DriverHolder;
import org.openqa.selenium.WebDriver;

abstract class AbstractCustomElement {

    WebDriver webDriver = DriverHolder.getDriver();
    SearchStrategy searchStrategy = new SearchStrategy();

}
