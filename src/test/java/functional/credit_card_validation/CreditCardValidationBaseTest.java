package functional.credit_card_validation;

import com.wiley.page.PageProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.onelya.qa.base.UiBaseTest;
import ru.onelya.qa.config.Environment;
import ru.onelya.qa.pages.credit_card_validation.CreditCardDetailsPage;

public class CreditCardValidationBaseTest extends UiBaseTest {

    protected static final Logger LOGGER = LoggerFactory.getLogger(CreditCardValidationBaseTest.class);

    protected static final String CREDIT_CARD_FORM_URL = Environment.get().getProperties().getCreditCardFormUrl();
    protected static final String CREDIT_CARD_VALID_NUMBER = "1111-2222-3333-4444-5555";
    protected static final String CREDIT_CARD_VALID_EXPIRATION_MONTH = "12";
    protected static final String CREDIT_CARD_VALID_EXPIRATION_YEAR = "2019";
    protected static final String CREDIT_CARD_VALID_CVV = "999";
    protected static final String CREDIT_CARD_VALID_AMOUNT = "9.99";

    protected CreditCardDetailsPage navigateToCreditCardDetailsPage() {
        return PageProvider.get(CreditCardDetailsPage.class, CREDIT_CARD_FORM_URL);
    }

    protected CreditCardDetailsPage fillAllInputsWithValidData() {
        return PageProvider.get(CreditCardDetailsPage.class, CREDIT_CARD_FORM_URL);
    }
}
