package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class NameValidationFailTest {

    @Test
    public void
    ชื่อเป็นค่าว่าง() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isEmptyName("");
        assertFalse("ต้องไม่ผ่านนะ เพราะมันมีค่าว่าง", result);
    }

    @Test
    public void
    ชื่อเป็นค่าNull() {
        NameValidation validation = new NameValidation();
        boolean result = validation.isNull(null);
        assertFalse("ต้องไม่ผ่านนะ เพราะมันมีค่าว่าง", result);
    }

    @Test
    public void lengthNameLessThanTwo() {
        NameValidation validation = new NameValidation();
        boolean result = validation.checkLength("a");
        assertFalse("ตัหนังสือน้อยกว่าสอง!", result);
    }

    @Test
    public void lengthNameBetween2to20() {
        NameValidation validation = new NameValidation();
        boolean result = !validation.checkLength2to20("testestestestestestestwwww");
        assertFalse("ตัวหนังสือมากเกิน20!", result);
    }

    @Test
    public void symbolic() {
        NameValidation validation = new NameValidation();
        boolean result = !validation.checkSymbol("asdf!!!!@@#");
        assertFalse("Name can't be special character", result);
    }

}
