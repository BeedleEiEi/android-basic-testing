package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Beedle on 15/11/2560.
 */

public class EmailValidationSuccessTest {
    @Test
    public void EmptyEmail() {
        EmailValidation email = new EmailValidation();
        boolean result = email.isEmptyName("Deta@aaa.com");
        assertTrue("Email is empty!!", result);
    }

    @Test
    public void nullEmail() {
        EmailValidation email = new EmailValidation();
        boolean result = email.isNull("This@outlook.com");
        assertTrue("Email is not  Null!!", result);
    }

    @Test
    public void lengthMoreThan14() {
        EmailValidation email = new EmailValidation();
        boolean result = email.lessThan14("abbderewryr@gmail.com");
        assertFalse("Letter more than 14!!", result);
    }

    @Test
    public void emailPattern() {
        EmailValidation email = new EmailValidation();
        boolean result = email.checkPattern("abcm@gmail.com");
        assertTrue("Email is Incorrect!!", result);
    }
}
