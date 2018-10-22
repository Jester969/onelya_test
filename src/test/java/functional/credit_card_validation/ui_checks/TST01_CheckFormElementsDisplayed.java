package functional.credit_card_validation.ui_checks;

import functional.credit_card_validation.CreditCardValidationBaseTest;
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
