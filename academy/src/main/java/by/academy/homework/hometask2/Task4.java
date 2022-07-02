package main.java.by.academy.homework.hometask2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        int n = 5;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of players:");
        int p = sc.nextInt();

        if (p < 1 | p > 10) {
            System.out.println("You have to enter the number between 1 & 10");
            return;
        }

        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♦/diamonds", "♠/spades", "♥/hearts", "♣/clubs"};

        int number_of_cards = rank.length * suits.length;

        String[] deck = new String[number_of_cards];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < number_of_cards; i++) {
            int r = i + (int) (Math.random() * (number_of_cards-i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < p * n; i++) {
            System.out.print(deck[i] + " ");
            if (i % n == n- 1)
                System.out.println();
        }
        sc.close();
    }
}



