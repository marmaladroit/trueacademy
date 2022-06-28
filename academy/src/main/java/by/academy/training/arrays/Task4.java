package main.java.by.academy.training.arrays;

public class Task4 {
    //Создать двумерный массив типа char размером 4х2.
    //И записать туда значения с помощью блока для инициализации.
    //Распечатать значения массива.
    public static void main (String [] args) {
        char [][] chArray = new char [][]
                {{'a', '1'}, {'b', '2'}, {'c','3'}, {'d', '4'}} ;

        for (int i = 0; i < chArray.length; i++){
            for (int j = 0; j < chArray[0].length; j++) {
                System.out.print(" " + chArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}

