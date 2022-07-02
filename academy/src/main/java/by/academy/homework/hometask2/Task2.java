package main.java.by.academy.homework.hometask2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some words");
        String read = sc.nextLine();

        System.out.println("Enter the number N");
        n = sc.nextInt();

        String shortword;
        String[] words = read.split(" ");

        shortword = words[0];

        for (int i = 1; n > i; i++) {
            if (shortword.length() > words[i].length()) {
                shortword = words[i];
            }
        }
        System.out.println("The shortest word is " + shortword);
        sc.close();
    }
}




