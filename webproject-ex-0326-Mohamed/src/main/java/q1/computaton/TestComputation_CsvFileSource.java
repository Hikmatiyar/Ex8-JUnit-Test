package q1.computaton; // Corrected package declaration

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TestComputation_CsvFileSource {
    @ParameterizedTest
    @CsvFileSource(resources = "Test.csv") 
    public void testCalculateDiscount(int input1, int input2, int expected) throws Exception {
        Computation com = new Computation(); 
        int result = com.calculateDiscount(input1, input2); 
        Assert.assertEquals(expected, result);
    }
}
