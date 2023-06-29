package main;

public class PartThree {
    public static double[][] third(int a_FIRST_SIZE, int a_SECOND_SIZE) {
        // объявление и заполнение третьего массива
        int A_FIRST_SIZE = a_FIRST_SIZE;
        int A_SECOND_SIZE = a_SECOND_SIZE;
        int [] A = PartOne.first(0);
        double [] x = PartTwo.second(19, -5.0, 13.0);
        double cache;
        double[][] a = new double[A_FIRST_SIZE][A_SECOND_SIZE];
        for (int i = 0; i < A_FIRST_SIZE; i++) {
            for (int j = 0; j < A_SECOND_SIZE; j++) {
                if (A[i] == 7) {
                    cache = Math.pow(Math.E, x[j]);
                    cache = Math.pow((cache * (1 - Math.tan(x[j]))), 2); //2 степень
                    cache = Math.pow(Math.E, cache);
                } else if (A[i] == 1 || A[i] == 3 || A[i] == 13 || A[i] == 15) {
                    cache = Math.pow((x[j] + Math.PI), 3); //3 степень
                    cache = Math.pow(((Math.pow(x[j] * (x[j] - 1), 3) - 1) / (Math.asin((x[j] + 4) / 18))), cache);
                    cache = Math.pow(Math.E, cache);
                } else {
                    cache = Math.cbrt(Math.sin(x[j])) + Math.PI;
                    cache = Math.atan(Math.cos(x[j])) * cache + 1;
                    cache = Math.pow((Math.PI * cache), 3); //3 степень
                }
                a[i][j] = cache;
            }
        }
        for (int i = 0; i < A_FIRST_SIZE; i++) {
            for (int j = 0; j < A_SECOND_SIZE; j++) {
                if (Double.isNaN(a[i][j])) {
                    a[i][j] = 0;
                }
                if (Double.isInfinite(a[i][j])) {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
}


