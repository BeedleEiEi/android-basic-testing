package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by student on 11/10/2017 AD.
 */

public class NameValidationSuccessTest {

    @Test
    public void
    ชื่อเป็นค่าEmpty() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmptyName("Hjaleluyjasdsa");
        System.out.println(result);
        assertTrue("Not Empty", result);
    }

    @Test
    public void
    ชื่อเป็นค่าNull() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isNull("Hjaleluyja");
        System.out.println(result);
        assertTrue("Not Null", result);
    }

    @Test
    public void lengthNameLessThanTwo() {
        NameValidation validation = new NameValidation();
        boolean result = validation.checkLength("aa");
        assertTrue(result);
    }

    @Test
    public void lengthNameBetween2to20() {
        NameValidation validation = new NameValidation();
        boolean result = validation.checkLength2to20("test56789");
        assertTrue("ตัวหนังสืออยู่ในเกณฑ์!", result);
    }

    @Test
    public void symbolic() {
        NameValidation validation = new NameValidation();
        boolean result = validation.checkSymbol("asdfaaa");
        assertTrue(result);
    }
}
