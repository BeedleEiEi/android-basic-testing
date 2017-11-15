package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by Beedle on 15/11/2560.
 */

public class EmailValidationFailTest {
    @Test
    public void EmptyEmail() {
        EmailValidation email = new EmailValidation();
        boolean result = email.isEmptyName("");
        assertFalse("Email is empty!!", result);
    }

    @Test
    public void nullEmail() {
        EmailValidation email = new EmailValidation();
        boolean result = email.isNull("");
        assertFalse("Email is Null!!", result);
    }

    @Test
    public void lengthLessThan14() {
        EmailValidation email = new EmailValidation();
        boolean result = email.lessThan14("a@gmail.com");
        assertFalse("Letter less than 14!!", result);
    }

    @Test
    public void emailPattern() {
        EmailValidation email = new EmailValidation();
        boolean result = email.checkPattern("abcm");
        assertTrue("Email is Incorrect!!", result);
    }
}
