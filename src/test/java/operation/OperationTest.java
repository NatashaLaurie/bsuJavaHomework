package operation;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class OperationTest {

    @Test(description = "positive test for finding a number consisting of only different digits")
    public void testFindUniqDigitsNumberPositive() {
        double[] nums = new double[]{33.44, 3.765, 98, 54332.08};
        try {
            double actual = Operation.findUniqDigitsNumber(nums);
            double expected = 3.765;
            Assert.assertEquals(actual, expected, "test wrong because .....");
        } catch (NoSuchElementException e) {
            Assert.fail("an was thrown Exception before Assert. For expected = 3.765 actual value was not find");
        }
    }

    @Test(expectedExceptions = NoSuchElementException.class)
    public void testFindUniqDigitsNumberException() {
        double[] nums = new double[]{33.44, 55, 4.606};
        Operation.findUniqDigitsNumber(nums);
    }

    @DataProvider(name = "numbers")
    public Object[][] initData() {
        return new Object[][]{
                {35, new double[]{2.33, -14.22, 35, 54.6, -76}},
                {-1.2, new double[]{122, -1.2, 43.6}},
                {15.4, new double[]{15.4}},
                {56.9, new double[]{11, 0, 56.9}} //0 is 0.0 as double
        };
    }

    @Test(dataProvider = "numbers")
    public void testFindUniqDigitsNumberPositiveTwo(double expected, double[] nums) {
        try {
            double actual = Operation.findUniqDigitsNumber(nums);
            Assert.assertEquals(actual, expected);
        } catch (NoSuchElementException e) {
            Assert.fail("an was thrown Exception before Assert. For expected " + expected +
                    " actual value was not find");
        }
    }

}