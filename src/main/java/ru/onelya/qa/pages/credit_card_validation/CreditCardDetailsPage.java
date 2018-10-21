package ru.onelya.qa.pages.credit_card_validation;

import com.wiley.elements.TeasyElement;
import org.openqa.selenium.By;
import ru.onelya.qa.pages.ProjectBasePage;

public class CreditCardDetailsPage extends ProjectBasePage {

    private static final By CREDIT_CARD_FORM_LOCATOR = By.cssSelector("#card");
    private static final By CREDIT_CARD_NUMBER_LOCATOR = By.cssSelector("#pan");
    private static final By CREDIT_CARD_CVV_LOCATOR = By.cssSelector("#cvv");
    private static final By CREDIT_CARD_EXPIRATION_MONTH_LOCATOR = By.cssSelector("#expiration_month");
    private static final By CREDIT_CARD_EXPIRATION_YEAR_LOCATOR = By.cssSelector("#expiration_year");
    private static final By CREDIT_CARD_PAYMENT_AMOUNT_LOCATOR = By.cssSelector("#amount");
    private static final By CREDIT_CARD_ERROR_LOCATOR = By.cssSelector(".error");

    public CreditCardDetailsPage checkCreditCardFormElementIsDisplayed() {
        getCreditCardFormElement().should().beDisplayed();
        return this;
    }

    public CreditCardDetailsPage checkCreditCardNumberElementIsDisplayed() {
        getCreditCardNumberElement().should().beDisplayed();
        return this;
    }

    public CreditCardDetailsPage checkCreditCardCvvElementIsDisplayed() {
        getCreditCardCvvElement().should().beDisplayed();
        return this;
    }

    public CreditCardDetailsPage checkCreditCardExpirationMonthElementIsDisplayed() {
        getCreditCardExpirationMonthElement().should().beDisplayed();
        return this;
    }

    public CreditCardDetailsPage checkCreditCardExpirationYearElementIsDisplayed() {
        getCreditCardExpirationYearElement().should().beDisplayed();
        return this;
    }

    public CreditCardDetailsPage checkCreditCardAmountElementIsDisplayed() {
        getCreditCardAmountElement().should().beDisplayed();
        return this;
    }

    public CreditCardDetailsPage checkCreditCardErrorElementIsAbsent() {
        getCreditCardErrorElement().should().beAbsent();
        return this;
    }

    private TeasyElement getCreditCardFormElement() {
        return element(CREDIT_CARD_FORM_LOCATOR);
    }

    private TeasyElement getCreditCardNumberElement() {
        return element(CREDIT_CARD_NUMBER_LOCATOR);
    }

    private TeasyElement getCreditCardCvvElement() {
        return element(CREDIT_CARD_CVV_LOCATOR);
    }

    private TeasyElement getCreditCardExpirationMonthElement() {
        return element(CREDIT_CARD_EXPIRATION_MONTH_LOCATOR);
    }

    private TeasyElement getCreditCardExpirationYearElement() {
        return element(CREDIT_CARD_EXPIRATION_YEAR_LOCATOR);
    }

    private TeasyElement getCreditCardAmountElement() {
        return element(CREDIT_CARD_PAYMENT_AMOUNT_LOCATOR);
    }

    private TeasyElement getCreditCardErrorElement() {
        return element(CREDIT_CARD_ERROR_LOCATOR);
    }

}
