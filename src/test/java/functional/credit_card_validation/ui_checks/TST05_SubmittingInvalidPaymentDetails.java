package functional.credit_card_validation.ui_checks;

import com.wiley.page.PageProvider;
import functional.credit_card_validation.CreditCardValidationBaseTest;
import functional.credit_card_validation.CreditCardValidationDataProviders;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.onelya.qa.pages.credit_card_validation.CreditCardDetailsPage;

public class TST05_SubmittingInvalidPaymentDetails extends CreditCardValidationBaseTest {

    @BeforeClass
    public void setUpPage() {
        navigateToCreditCardDetailsPage();
    }

    @BeforeMethod
    public void setUpData() {
        fillAllInputsWithValidData();
    }

    @Test(dataProviderClass = CreditCardValidationDataProviders.class, dataProvider = "invalidCardNumbers")
    public void test_TST05_SubmittingInvalidPaymentDetails_number(String invalidCardNumber) {
        PageProvider.get(CreditCardDetailsPage.class)
                .inputCreditCardNumber(invalidCardNumber)
                .clickCreditCardSubmitButton()
                .checkCreditCardErrorElementIsAbsent();
    }

    @Test(dataProviderClass = CreditCardValidationDataProviders.class, dataProvider = "invalidCvv")
    public void test_TST05_SubmittingInvalidPaymentDetails_cvv(String invalidCvv) {
        PageProvider.get(CreditCardDetailsPage.class)
                .inputCreditCardCvv(invalidCvv)
                .clickCreditCardSubmitButton()
                .checkCreditCardErrorElementIsAbsent();
    }

    // Same approach goes for other parameters...
}
