package functional.credit_card_validation.ui_checks;

import functional.credit_card_validation.CreditCardValidationBaseTest;
import functional.credit_card_validation.CreditCardValidationDataProviders;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TST05_SubmittingInvalidPaymentDetails extends CreditCardValidationBaseTest {

    @BeforeClass
    public void setUp() {
        navigateToCreditCardDetailsPage();
    }

    @Test(dataProviderClass = CreditCardValidationDataProviders.class, dataProvider = "invalidCardNumbers")
    public void test_TST05_SubmittingInvalidPaymentDetails_number(String invalidCardNumber) {
    }
}
