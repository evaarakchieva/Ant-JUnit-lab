package main;

public class PartTwo {
    public static double[] second(int x_size, double Min_RANGE, double Max_RANGE) {
        // объявление и заполнение второго массива
        int X_SIZE = x_size;
        double MIN_RANGE = Min_RANGE;
        double MAX_RANGE = Max_RANGE;
        double[] x = new double[X_SIZE];
        for (int i = 0; i < X_SIZE; i++) {
            x[i] = i * (MAX_RANGE - MIN_RANGE) + MIN_RANGE;
        }
        return x;
    }
}
