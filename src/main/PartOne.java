package main;

public class PartOne {
    public static int[] first(int g) {
        // объявление и заполнение первого массива
        int[] A = new int[9]; //было 9
        for (int h = 1; h <= 17; h++) {
            if (h % 2 == 1) { //было h % 2 == 1
                A[g] = h;
            } else {
                g++;
            }
        }
        return A;
    }
}
