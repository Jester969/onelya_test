package com.acme.qa.pages;

import com.acme.qa.elements.TextField;
import com.wiley.page.BasePage;
import org.openqa.selenium.By;

public class ProjectBasePage extends BasePage {

    protected TextField textField(By by) {
        return new TextField(by);
    }
}
