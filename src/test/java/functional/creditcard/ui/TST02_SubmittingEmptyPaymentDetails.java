package functional.creditcard.ui;

import functional.creditcard.CreditCardValidationBaseTest;
import org.testng.annotations.Test;

public class TST02_SubmittingEmptyPaymentDetails extends CreditCardValidationBaseTest {

    @Test
    public void test_TST02_SubmittingEmptyPaymentDetails() {
        navigateToCreditCardDetailsPage()
                .clickCreditCardSubmitButton()
                .checkCreditCardErrorElementIsDisplayed();
    }
}
