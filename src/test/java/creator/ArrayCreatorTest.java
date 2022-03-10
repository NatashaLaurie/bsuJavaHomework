package creator;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class ArrayCreatorTest {

    ArrayCreator creator;

    @BeforeClass
    public void setUp() {
        creator = new ArrayCreator();
    }

    @Test(description = "positive test for creating array of doubles")
    public void factoryArrayTestPositive() {
        String[] strings = {"35.86", "42", "0.45"};

        double[] actual = creator.factoryArray(strings);
        double[] expected = {35.86, 42.0, 0.45};

        Assert.assertEquals(actual, expected, "test wrong because .....");
    }

    @Test(description = "negative test for creating array of doubles")
    public void factoryArrayTestNegative() {
        String[] strings = {"35.86", "42", "0.45"};

        double[] actual = creator.factoryArray(strings);
        double[] expected = {35.86, 0.45};

        Assert.assertNotEquals(actual, expected, "test wrong because .....");
    }

    @AfterClass
    public void tierDown() {
        creator = null;
    }
}