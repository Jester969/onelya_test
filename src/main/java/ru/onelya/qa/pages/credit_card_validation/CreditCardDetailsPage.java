package ru.onelya.qa.pages.credit_card_validation;

import com.wiley.elements.TeasyElement;
import org.openqa.selenium.By;
import ru.onelya.qa.elements.TextField;
import ru.onelya.qa.pages.ProjectBasePage;

public class CreditCardDetailsPage extends ProjectBasePage {

    private static final By CREDIT_CARD_FORM_LOCATOR = By.cssSelector("#card");
    private static final By CREDIT_CARD_NUMBER_LOCATOR = By.cssSelector("#pan");
    private static final By CREDIT_CARD_CVV_LOCATOR = By.cssSelector("#cvv");
    private static final By CREDIT_CARD_EXPIRATION_MONTH_LOCATOR = By.cssSelector("#expiration_month");
    private static final By CREDIT_CARD_EXPIRATION_YEAR_LOCATOR = By.cssSelector("#expiration_year");
    private static final By CREDIT_CARD_PAYMENT_AMOUNT_LOCATOR = By.cssSelector("#amount");
    private static final By CREDIT_CARD_SUBMIT_BUTTON_LOCATOR = By.cssSelector("#submit");
    private static final By CREDIT_CARD_ERROR_LOCATOR = By.cssSelector(".error");

    public CreditCardDetailsPage inputCreditCardNumber(String cardNumber) {
        getCreditCardNumberElement().clearAndType(cardNumber);
        return this;
    }

    public CreditCardDetailsPage inputCreditCardCvv(String cvv) {
        getCreditCardCvvElement().clearAndType(cvv);
        return this;
    }

    public CreditCardDetailsPage inputCreditCardExpirationMonth(String expirationMonth) {
        getCreditCardExpirationMonthElement().clearAndType(expirationMonth);
        return this;
    }

    public CreditCardDetailsPage inputCreditCardExpirationYear(String expirationYear) {
        getCreditCardExpirationYearElement().clearAndType(expirationYear);
        return this;
    }

    public CreditCardDetailsPage inputCreditCardAmount(String amount) {
        getCreditCardAmountElement().clearAndType(amount);
        return this;
    }

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

    public CreditCardDetailsPage checkCreditCardSubmitButtonIsDisplayed() {
        getCreditCardSubmitButtonElement().should().beDisplayed();
        return this;
    }

    public CreditCardDetailsPage clickCreditCardSubmitButton() {
        getCreditCardSubmitButtonElement().click();
        return this;
    }

    public CreditCardDetailsPage checkCreditCardErrorElementIsAbsent() {
        getCreditCardErrorElement().should().beAbsent();
        return this;
    }

    public CreditCardDetailsPage checkCreditCardErrorElementIsDisplayed() {
        getCreditCardErrorElement().should().beDisplayed();
        return this;
    }

    private TeasyElement getCreditCardFormElement() {
        return element(CREDIT_CARD_FORM_LOCATOR);
    }

    private TextField getCreditCardNumberElement() {
        return textField(CREDIT_CARD_NUMBER_LOCATOR);
    }

    private TextField getCreditCardCvvElement() {
        return textField(CREDIT_CARD_CVV_LOCATOR);
    }

    private TextField getCreditCardExpirationMonthElement() {
        return textField(CREDIT_CARD_EXPIRATION_MONTH_LOCATOR);
    }

    private TextField getCreditCardExpirationYearElement() {
        return textField(CREDIT_CARD_EXPIRATION_YEAR_LOCATOR);
    }

    private TextField getCreditCardAmountElement() {
        return textField(CREDIT_CARD_PAYMENT_AMOUNT_LOCATOR);
    }

    private TeasyElement getCreditCardSubmitButtonElement() {
        return element(CREDIT_CARD_SUBMIT_BUTTON_LOCATOR);
    }

    private TeasyElement getCreditCardErrorElement() {
        return element(CREDIT_CARD_ERROR_LOCATOR);
    }

}
