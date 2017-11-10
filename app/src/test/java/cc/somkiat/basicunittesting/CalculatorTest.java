package cc.somkiat.basicunittesting;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test //Test ละ 1
    public void bobo(){
        Bobo bobo = new Bobo();
            String is_bobo = bobo.isBobo("BoBo");
        assertEquals("True", is_bobo);
    }

    @Test
    public void
    เจ็ดบวกสองได้เก้า(){
        Calculator cal = new Calculator();
        int result = cal.plus(7,2);
        assertEquals(9, result);
    }


}
