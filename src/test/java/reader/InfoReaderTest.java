package reader;

import org.testng.Assert;
import org.testng.annotations.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.testng.Assert.*;

public class InfoReaderTest {

    InfoReader reader;

    @BeforeClass
    public void setUp() {
        reader = new InfoReader();
    }


    @Test(description = "positive test for creating an array of strings from an input string (space as delimiter)"
    )
    public void testReadStringArray() {
        String inputString = "It's 03-03-2022 or 03/03/2022 or 03.03,2022 year";
        ByteArrayInputStream in = new ByteArrayInputStream(inputString.getBytes());
        System.setIn(in);                     // подменяем ввод
        String[] actual = reader.readStringArray(in);
        String[] expected = {"It's", "03-03-2022", "or", "03/03/2022", "or", "03.03,2022", "year"};
        Assert.assertEquals(actual, expected, "test wrong because .....");
        System.setIn(System.in); // подменяем обратно
    }

    @AfterClass
    public void tearDown() {
        reader = null;
    }

}