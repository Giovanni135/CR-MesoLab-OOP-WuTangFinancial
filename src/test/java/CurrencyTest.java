import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CurrencyTest {
    CurrencyConverter converter;


    @Before
    public void setUp() {
        converter = new CurrencyConverter();
    }


    @Test
    public void usdToInternationalTest() {
        double expected = 9.39;
        double actual = converter.usdToInternational("EUR", 10);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void internationalToUSDTest() {
        double expected = 10.63;
        double actual = converter.internationalToUSD("EUR", 10);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void dollarToEuroTest() {
        double expected = 37.60;
        double actual = converter.convertCurrency("USD", "EUR", 40);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void euroToUSDTest() {
        double expected = 10.64;
        double actual = converter.convertCurrency("EUR", "USD", 10);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void euroToGBPTest() {
        double expected = 8.72;
        double actual = converter.convertCurrency("EUR", "GBP", 10);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void GBPtoINR() {
        double expected = 833.17;
        double actual = converter.convertCurrency("GBP", "INR", 10);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void INRtoCAD() {
        double expected = 0.1932;
        double actual = converter.convertCurrency("INR", "CAD", 10);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void CADtoSGD() {
        double expected = 108.33;
        double actual = converter.convertCurrency("CAD", "SGD", 100);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void SGDtoCHF() {
        double expected = 70.63;
        double actual = converter.convertCurrency("SGD", "CHF", 100);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void CHFtoMYR() {
        double expected = 442.57;
        double actual = converter.convertCurrency("CHF", "MYR", 100);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void MYRtoJPY() {
        double expected = 2591.50;
        double actual = converter.convertCurrency("MYR", "JPY", 100);
        Assert.assertEquals(expected, actual, .01);
    }

    @Test
    public void JPYtoYEN() {
        double expected = 5.97;
        double actual = converter.convertCurrency("JPY", "CNY", 100);
        Assert.assertEquals(expected, actual, .01);
    }
}





