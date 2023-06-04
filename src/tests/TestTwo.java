package tests;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class TestTwo {
    int X_SIZE;
    double MIN_RANGE;
    double MAX_RANGE;
    double[] x;

    @Before
    public void setUp() {
        X_SIZE = 19;
        MIN_RANGE = -5.0;
        MAX_RANGE = 13.0;
        x = new double[X_SIZE];
        for (int i = 0; i < X_SIZE; i++) {
            x[i] = ((i * (MAX_RANGE - MIN_RANGE)) + MIN_RANGE);
        }
    }
    @Test
    public void testX() {
        double[] expected = {-5.0, 13.0, 31.0, 49.0, 67.0, 85.0, 103.0, 121.0, 139.0, 157.0, 175.0, 193.0, 211.0, 229.0, 247.0, 265.0, 283.0, 301.0, 319.0};
        assertArrayEquals(expected, x, 0.0001);
    }
}
