package main.java.by.academy.training.cycles;
import java.util.Scanner;
public class Task2 {
    //С помощью класса Scanner ввести целое число.
    //Если это число от 0 до 10, вывести на консоль сообщение
    //“Положительное число меньше 10”, иначе вывести сообщение
    //“Положительное число больше 10 или отрицательное”.
    //Используем оператор if-else.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number");
        int number = sc.nextInt();
        if (number > 0 && number < 10) {
            System.out.println("Your number is positive and less than 10");
        } else if (number > 10) {
            System.out.println("Your number is positive and more than 10");
        } else if (number < 0) {
            System.out.println("Your number is negative");
        } else if (number == 0) {
            System.out.println("Your number is zero");
        } else {
        System.out.println("Your number is ten");
    }
        sc.close();
    }
}
