package main.java.by.academy.homework.hometask1;
import java.util.Scanner;
public class exercise3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from 1 to 10 : ");
        int x;
        int y;
        x = sc.nextInt();

        while (x < 1) {
            System.out.println("Number is false. Try again: ");
            x = sc.nextInt();
        }
        while (x > 10) {
            System.out.println("Number is false. Try again: ");
            x = sc.nextInt();
        }
            for (y = 1; y <= 10; y++) System.out.println(x + " * " + y + " = " + x * y);

    }
}
