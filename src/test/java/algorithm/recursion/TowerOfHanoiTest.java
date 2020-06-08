package algorithm.recursion;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TowerOfHanoiTest {

    @Test
    void move() {
        String expected = "Move: 1 from A to B. \nMove: 2 from A to C. \nMove: 1 from B to C. \n";
        String result = new TowerOfHanoi().move(2, 'A', 'C', 'B');
        Assert.assertEquals(expected, result);
    }
}