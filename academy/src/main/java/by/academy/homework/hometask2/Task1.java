package main.java.by.academy.homework.hometask2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;

        System.out.println("Enter your comparison string");
        char[] str1 = sc.nextLine().toCharArray();
        System.out.println("Enter your next string");
        char[] str2 = sc.nextLine().toCharArray();

        for (int j : str1) {
            s1 = s1 + j;
        }

        for (int j : str2) {
            s2 = s2 + j;
        }

        if (s1 != s2) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }

        sc.close();
    }
}




