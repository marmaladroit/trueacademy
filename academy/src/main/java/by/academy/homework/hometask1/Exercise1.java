
package main.java.by.academy.homework.hometask1;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {

        double price;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your purchase amount");
        int sum = sc.nextInt();

        if (sum < 100) {
            price = sum - sum * 0.05;
            System.out.println("The cost of your purchase " + price + " rubles");

        } else if (sum < 200) {
            price = sum - sum * 0.07;
            System.out.println("The cost of your purchase " + price + " rubles");

        } else if (sum < 300) {
            System.out.println("Enter your age");
            int age = sc.nextInt();
            if (age > 18) {
                price = sum - sum * 0.16;
                System.out.println("The cost of your purchase " + price + " rubles");
            } else {
                price = sum - sum * 0.09;
            System.out.println("The cost of your purchase " + price + " rubles");
            }
        } else if (sum < 400) {
            price = sum - sum * 0.14;

            System.out.println("The cost of your purchase " + price + " rubles");

        } else  {
            price = sum - sum * 0.20;
            System.out.println("The cost of your purchase " + price + " rubles");

            sc.close();

        }
    }
}


