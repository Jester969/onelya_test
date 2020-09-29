package functional.creditcard.ui;

import functional.creditcard.CreditCardValidationBaseTest;
import org.testng.annotations.Test;

public class TST01_CheckFormElementsDisplayed extends CreditCardValidationBaseTest {

    @Test(description = "Check that all necessary elements are displayed on payment form.")
    public void test_TST01_CheckFormElementsDisplayed() {
        navigateToCreditCardDetailsPage()
                .checkCreditCardFormElementIsDisplayed()
                .checkCreditCardNumberElementIsDisplayed()
                .checkCreditCardExpirationMonthElementIsDisplayed()
                .checkCreditCardExpirationYearElementIsDisplayed()
                .checkCreditCardCvvElementIsDisplayed()
                .checkCreditCardAmountElementIsDisplayed()
                .checkCreditCardSubmitButtonIsDisplayed();
    }
}
