package test;

import org.junit.Assert;
import org.junit.Test;

public class CalcTest {
    private Calc calc = new Calc();
    
    @Test
    public void testSum() throws Exception {
        Assert.assertEquals(5, calc.sum(2,3));
    }
}
