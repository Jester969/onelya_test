package ru.onelya.qa.pages;

import com.wiley.page.BasePage;
import org.openqa.selenium.By;
import ru.onelya.qa.elements.TextField;

public class ProjectBasePage extends BasePage {

    protected TextField textField(By by) {
        return new TextField(by);
    }
}
