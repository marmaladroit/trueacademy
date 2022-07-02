package main.java.by.academy.homework.hometask2;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word number 1");
        String n1 = sc.nextLine();


        System.out.println("Enter word number 2");
        String n2 = sc.nextLine();

        int l1 = n1.length();
        int l2 = n2.length();

        if (l1 % 2 != 0 | l2 % 2 != 0) {
            System.out.println("Your words are uneven");
        } else {
            String str = (n1.substring(0, l1 / 2)) + (n2.substring(l2 / 2, l2));
            System.out.println("Mixed word is " + str);
        }
        sc.close();
    }
}
