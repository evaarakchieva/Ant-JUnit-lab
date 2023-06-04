package tests;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestOne {
    int h;
    int g;
    int[] A;

    @Before
    public void setUp() {
        g = 0;
        A = new int[(17 - 1) / 2 + 1];
        for (h = 1; h <= 17; h++) {
            if (h % 2 == 1) {
                A[g] = h;
            } else {
                g++;
            }
        }
    }
    @Test
    public void testA() {
        int[] expected = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        assertArrayEquals(expected, A);
    }
}
