package functional.credit_card_validation;

import org.testng.annotations.DataProvider;

public class CreditCardValidationDataProviders {

    @DataProvider
    static Object[] invalidCardNumbers() {
        return new Object[]{
                "",                                     // empty card number
                "1111-2222-3333-4444-555",              // wrong length, -1 char
                "1111-2222-3333-4444-555$",             // illegal character included
                "1111-2222-3333-4444-55555",            // longer than expected
                "1111-222-23333-4444-5555",             // wrong section length
                "SELECT * FROM users WHERE email = "    // simple SQL injection
        };
    }
}
