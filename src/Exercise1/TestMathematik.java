package Exercise1;

import org.junit.Assert;
import org.junit.Test;

public class TestMathematik {
    @Test
    public void testWithPositiveNumbers() {

        int a = 1;
        int b = 3;
        int mean = Mathematik.mean(a, b);
        Assert.assertEquals(mean, 2);
    }

    @Test
    public void testBetweenTwoNumbers() {
        int a = 1;
        int b = 2;
        int mean = Mathematik.mean(a, b);
        Assert.assertEquals(mean, 1);
    }

    @Test
    public void testWithNegativeNumbers() {
        Mathematik mathematik = new Mathematik();
        int a = -1;
        int b = -3;
        int mean = mathematik.mean(a, b);
        Assert.assertEquals(mean, -2);
    }

    @Test
    public void testBetweenTwoNumberswithNegativNumbers() {
        int a = -1;
        int b = -2;
        int mean = Mathematik.mean(a, b);
        Assert.assertEquals(mean, -1);
    }

    @Test
    public void testMeanOverflow() {
        int res = Mathematik.mean(Integer.MAX_VALUE - 1, Integer.MAX_VALUE);


    Assert.assertEquals(Integer.MAX_VALUE-1,res);
}
}
