package main.java.by.academy.training.arrays;

public class Task3 {
    //Создать массив типа String размером 3х6. И записать в него значения:
    //a1  a2  a3  a4  a5  a6
    //b1  b2  b3  b4  b5  b6
    //c1  c2   c3  c4  c5  c6
    //И распечатать.
    public static void main (String [] args) {
        String[][] abcArray = new String [3][6];
        abcArray[0][0] = "a1";
        abcArray[0][1] = "a2";
        abcArray[0][2] = "a3";
        abcArray[0][3] = "a4";
        abcArray[0][4] = "a5";
        abcArray[0][5] = "a6";

        abcArray[1][0] = "b1";
        abcArray[1][1] = "b2";
        abcArray[1][2] = "b3";
        abcArray[1][3] = "b4";
        abcArray[1][4] = "b5";
        abcArray[1][5] = "b6";

        abcArray[2][0] = "c1";
        abcArray[2][1] = "c2";
        abcArray[2][2] = "c3";
        abcArray[2][3] = "c4";
        abcArray[2][4] = "c5";
        abcArray[2][5] = "c6";

        for (int i = 0; i < abcArray.length; i++){
            for (int j = 0; j < abcArray[0].length; j++) {
                System.out.print(" " + abcArray[i][j] + " ");
            }
            System.out.println();
        }
    }
    }
