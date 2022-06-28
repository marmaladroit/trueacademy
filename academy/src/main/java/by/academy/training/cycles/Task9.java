package main.java.by.academy.training.cycles;

import java.util.Scanner;

public class Task9 {
    // В сберкассу на трёхпроцентный вклад положили S рублей.Какой станет сумма вклада через N лет.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sum");
        double s = sc.nextDouble();
        System.out.println("Enter the number of years");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            s = s + s * 0.03;
            System.out.print(s);
        }
        sc.close();
    }
}
