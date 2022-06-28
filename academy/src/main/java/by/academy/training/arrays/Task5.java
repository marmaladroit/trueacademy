package main.java.by.academy.training.arrays;

public class Task5 {
    //Создать двухмерный массив 5х8 и инициализировать
    //его с помощью блока для инициализации.
    //Найти максимальное и минимальное значение в каждой "строке"
    //и записать эти значения в двухмерный массив 5х2. Распечатать оба массива.
    public static void main(String[] args) {
        int[][] fArray = new int[][]
                {{1, 2, 3, 4, 5, 6, 7, 8}, {66, 98, 51, 33, 76, 45, 89, 100}, {9, 10, 11, 12, 13, 14, 15, 16}, {17, 18, 19, 20, 21, 22, 23, 24}, {29, 15, 8, 10, 77, 189, 212, 458}};
        for (int i = 0; i < fArray.length; i++) {
            for (int j = 0; j < fArray[0].length; j++) {
                System.out.print(" " + fArray[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < fArray.length; i++) {
            int min = fArray[i][0];
            int max = fArray[i][0];
            for (int j = 0; j < fArray[0].length; j++) {
                if (min > fArray[i][j]) {
                    min = fArray[i][j];
                }
                if (max < fArray[i][j]) {
                    max = fArray[i][j];
                }
            }
            System.out.print("Maximal value is  " + max + " & Minimal value is " + min + " \n");
        }
    }
}