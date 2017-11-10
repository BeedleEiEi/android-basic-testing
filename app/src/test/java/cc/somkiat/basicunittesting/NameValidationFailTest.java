package cc.somkiat.basicunittesting;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;

public class NameValidationFailTest {
    @Test
    public void
    ชื่อเป็นค่าว่าง(){NameValidation validation = new NameValidation();
    boolean result = validation.isEmpty("");
    assertFalse("ต้องไม่ผ่านนะ เพราะมันมีค่าว่าง", result);
    }

    @Test
    public void
    ชื่อเป็นค่าNull(){NameValidation validation = new NameValidation();
        boolean result = validation.isNull("");
        assertFalse("ต้องไม่ผ่านนะ เพราะมันมีค่าว่าง", result);
    }

    @Test
    public void nullOrEmptyName(){}

    @Test
    public void lengthNameLessThanTwo(){}

    @Test
    public void lengthNameBetween2to20(){}

    @Test
    public void notNullorEmptyEmail(){}

    @Test
    public void nullOrEmptyEmail(){}

    @Test
    public void emailPattern(){}
}
