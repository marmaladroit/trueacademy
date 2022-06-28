package main.java.by.academy.training.arrays;

public class Task1 {
    //Создать массив типа String с размером 7.
    //Записать в него значения дней недели.
    //Вывести на консоль значение последнего элемента.
    public static void main (String [] args) {
        String [] days = new String [7];
        days [0] = "Monday";
        days [1] = "Tuesday";
        days [2] = "Wednesday";
        days [3] = "Thursday";
        days [4] = "Friday";
        days [5] = "Saturday";
        days [6] = "Sunday";

      System.out.println("The last component is " + days[6]);
    }
}
