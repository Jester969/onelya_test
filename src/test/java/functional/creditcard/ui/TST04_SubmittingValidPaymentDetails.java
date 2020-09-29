package functional.creditcard.ui;

import functional.creditcard.CreditCardValidationBaseTest;
import org.testng.annotations.Test;

public class TST04_SubmittingValidPaymentDetails extends CreditCardValidationBaseTest {

    @Test
    public void test_TST04_SubmittingValidPaymentDetails() {

        navigateToCreditCardDetailsPage();

        fillAllInputsWithValidData()
                .clickCreditCardSubmitButton()
                .checkCreditCardErrorElementIsAbsent();

    }

}
