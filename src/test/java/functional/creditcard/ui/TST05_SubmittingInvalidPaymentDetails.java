package functional.creditcard.ui;

import com.acme.qa.pages.credit_card_validation.CreditCardDetailsPage;
import com.wiley.page.PageProvider;
import functional.creditcard.CreditCardValidationBaseTest;
import functional.creditcard.CreditCardValidationDataProviders;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
                .checkCreditCardErrorElementIsDisplayed();
    }

    @Test(dataProviderClass = CreditCardValidationDataProviders.class, dataProvider = "invalidCvv")
    public void test_TST05_SubmittingInvalidPaymentDetails_cvv(String invalidCvv) {
        PageProvider.get(CreditCardDetailsPage.class)
                .inputCreditCardCvv(invalidCvv)
                .clickCreditCardSubmitButton()
                .checkCreditCardErrorElementIsDisplayed();
    }

    // Same approach goes for other parameters...
}
