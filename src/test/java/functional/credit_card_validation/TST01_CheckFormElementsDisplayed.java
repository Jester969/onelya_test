package functional.credit_card_validation;

import com.wiley.page.PageProvider;
import org.testng.annotations.Test;
import ru.onelya.qa.base.Environment;
import ru.onelya.qa.base.UiBaseTest;
import ru.onelya.qa.pages.credit_card_validation.CreditCardDetailsPage;

public class TST01_CheckFormElementsDisplayed extends UiBaseTest {

    private static final String CREDIT_CARD_FORM_URL = Environment.get().getProperties().getCreditCardFormUrl();

    @Test(description = "Check that all necessary elements are displayed on payment form.")
    public void test_TST01_CheckFormElementsDisplayed() {
        PageProvider.get(CreditCardDetailsPage.class, CREDIT_CARD_FORM_URL)
                .checkCreditCardFormElementIsDisplayed()
                .checkCreditCardNumberElementIsDisplayed()
                .checkCreditCardExpirationMonthElementIsDisplayed()
                .checkCreditCardExpirationYearElementIsDisplayed()
                .checkCreditCardCvvElementIsDisplayed()
                .checkCreditCardAmountElementIsDisplayed();
    }
}
