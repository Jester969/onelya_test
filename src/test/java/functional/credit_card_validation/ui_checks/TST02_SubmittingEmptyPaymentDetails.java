package functional.credit_card_validation.ui_checks;

import functional.credit_card_validation.CreditCardValidationBaseTest;
import org.testng.annotations.Test;

public class TST02_SubmittingEmptyPaymentDetails extends CreditCardValidationBaseTest {

    @Test
    public void test_TST02_SubmittingEmptyPaymentDetails() {
        navigateToCreditCardDetailsPage()
                .clickCreditCardSubmitButton()
                .checkCreditCardErrorElementIsDisplayed();
    }
}
