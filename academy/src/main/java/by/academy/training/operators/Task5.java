package main.java.by.academy.training.operators;
import java.util.Scanner;
public class Task5 {
    //5. Ввести с консоли 2 числа, найти большее, меньшее,
    //среднее арифметическое.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int a = sc.nextInt();

        System.out.println("Enter 2nd number");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("The 1st number is bigger");
        } else if (a < b) {
            System.out.println("The 2nd number is bigger");
        } else {
            System.out.println("They are equal");
        }
        float c = (a + b) / 2;
        System.out.println("The a arithmetic mean is " + c );
    }
}