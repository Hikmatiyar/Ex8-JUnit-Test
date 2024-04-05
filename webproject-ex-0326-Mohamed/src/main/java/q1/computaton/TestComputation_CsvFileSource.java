package q2.csvfilesource;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {
    @ParameterizedTest
    @CsvFileSource(resources = "your_csv_file.csv") // Replace "your_csv_file.csv" with your actual CSV file name
    public void testGetDiscount(int input1, int input2, int expected) throws Exception {
        Computation com = new Computation();
        int result = com.calculateDiscount(input1, input2); // Assuming calculateDiscount is the method to test
        Assert.assertEquals(expected, result);
    }
}
