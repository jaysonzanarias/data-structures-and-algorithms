package algorithm.recursion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TailRecursionTest {

    @Test
    void factorial() {
        int expected = 6;
        Assert.assertEquals(expected, Factorial.factorial(3));
    }
}