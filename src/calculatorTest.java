import org.junit.Test;
import org.junit.Assert;


public class calculatorTest {

    @Test
    public void Sum() {
        calculator calc = new calculator();
        double res = calc.Sum(2, 3);
        Assert.assertEquals(5.0, res, 0.1);
        res = calc.Sum(2.4, 3);
        Assert.assertEquals(5.4, res, 0.1);
        res = calc.Sum(0, -0.2);
        Assert.assertEquals(-0.2, res, 0.1);
        res = calc.Sum(-2, 3);
        Assert.assertEquals(1, res, 0.1);
    }

    @Test
    public void Sub() {
        calculator calc = new calculator();
        double res = calc.Sub(6, 7);
        Assert.assertEquals(-1, res, 0.1);
        res = calc.Sub(-6, 7);
        Assert.assertEquals(-13, res, 0.1);
        res = calc.Sub(-1, -12.2);
        Assert.assertEquals(11.2, res, 0.1);
        res = calc.Sub(6, 0);
        Assert.assertEquals(6, res, 0.1);
    }

    @Test
    public void Div() {
        calculator calc = new calculator();
        double res = calc.Div(6, 5);
        Assert.assertEquals(1.2, res, 0.1);
        res = calc.Div(0, 5);
        Assert.assertEquals(0, res, 0.1);
        res = calc.Div(15, 5);
        Assert.assertEquals(3, res, 0.1);
        res = calc.Div(6, 0);
        Assert.assertEquals(0, res, 0.1);
    }

    @Test
    public void Proizv() {
        calculator calc = new calculator();
        double res = calc.Proizv(6, 5);
        Assert.assertEquals(30, res, 0.1);
        res = calc.Proizv(6, 1.5);
        Assert.assertEquals(9, res, 0.1);
        res = calc.Proizv(1.2, 1.2);
        Assert.assertEquals(1.44, res, 0.1);
        res = calc.Proizv(0.5, -22);
        Assert.assertEquals(-11, res, 0.1);
    }
}