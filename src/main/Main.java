package main;

public class Main {
    public static void main(String[] args) {

        // объявление и заполнение третьего массива
        final int A_FIRST_SIZE = 9;
        final int A_SECOND_SIZE = 19;
        double[][] a =  PartThree.third(A_FIRST_SIZE, A_SECOND_SIZE);

        // Вывод итогового массива
        for (int i = 0; i < A_FIRST_SIZE; i++) {
            for (int j = 0; j < A_SECOND_SIZE; j++) {
                System.out.printf("%.2f  ", a[i][j]);
            }
            System.out.println();
        }
//        for (int i = 0; i < 9; i++) {
//            System.out.print("{");
//            for (int j = 0; j < 19; j++) {
//                System.out.print(a[i][j]);
//                System.out.print(", ");
//            }
//            System.out.println("},");
//        }
    }
}

