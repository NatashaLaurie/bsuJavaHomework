package filter;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

public class StringFilterTest {

    StringFilter filter;

    @BeforeClass
    public void setUp() {
        filter = new StringFilter();
    }

    @Test(description = "positive test to filter an array of strings (regular expression for double and ints)")
    public void testFilterDouble() {
        String[] strings = {"35.86", "ert2441", ".456", ".k", "67,76", "42", "65.9t", ".", "8."};

        String[] actual = filter.filterDouble(strings);
        String[] expected = {"35.86", ".456", "42", "8."};

        Assert.assertEquals(actual, expected, "test wrong because .....");
    }

    @Test(description = "negative test to filter an array of strings (regular expression for double and ints)")
    public void testFilterDoubleNegative() {
        String[] strings = {"35.86", "ert2441", ".456", ".k", "67,76", "42", "65.9t", ".", "8."};

        String[] actual = filter.filterDouble(strings);
        String[] expected = {"35.86", ".456", "42"};

        Assert.assertNotEquals(actual, expected, "test wrong because .....");
    }

    @AfterClass
    public void tearDown() {
        filter = null;
    }
}