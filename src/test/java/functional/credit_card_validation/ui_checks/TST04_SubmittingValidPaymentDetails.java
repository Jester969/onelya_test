package functional.credit_card_validation.ui_checks;

import functional.credit_card_validation.CreditCardValidationBaseTest;
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
