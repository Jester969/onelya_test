package com.acme.qa.elements;

import com.wiley.elements.TeasyElement;
import com.wiley.elements.find.VisibleElementLookUp;
import com.wiley.elements.should.Should;
import org.openqa.selenium.By;

/**
 * Standard input field decorator for TeasyElement
 */
public class TextField extends AbstractCustomElement {

    private TeasyElement wrappedElement;

    public TextField(By by) {
        this.wrappedElement = new VisibleElementLookUp(webDriver, searchStrategy).find(by);
    }

    public Should should() {
        return wrappedElement.should();
    }

    public void clearAndType(String stringToType) {
        wrappedElement.clear();
        wrappedElement.sendKeys(stringToType);
    }
}
