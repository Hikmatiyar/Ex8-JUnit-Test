package q1.computaton; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestComputation_Parameterized {
    private int mInput1, mInput2, mExpected;
    private Computation com = new Computation(); // Assuming Computation is your main class to test

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {100, 1, 20},
                {101, 2, 30},
                {102, 3, 40}
        });
    }

    public TestComputation_Parameterized(int input1, int input2, int expected) {
        this.mInput1 = input1;
        this.mInput2 = input2;
        this.mExpected = expected;
    }

    @Test
    public void testCalculateDiscount() {
        int result = com.calculateDiscount(mInput1, mInput2); // Assuming calculateDiscount is the method to test
        Assert.assertEquals(mExpected, result);
    }
}
