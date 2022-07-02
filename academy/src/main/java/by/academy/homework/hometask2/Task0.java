package main.java.by.academy.homework.hometask2;

import java.io.IOException;
import java.util.Scanner;

public class Task0 {

    static int pairs(int k, int[] arr) {
        int pairsCount = 0;
        for (int value : arr) {
            for (int i : arr) {
                if (value - i == k) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
            System.out.println(arr[i]);
        }

        int result = pairs(k, arr);
        System.out.println(result);

        scanner.close();
    }
}
