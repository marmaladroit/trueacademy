package main.java.by.academy.training.cycles;

public class Task5 {
    // Распечатать все числа от 1 до 100, которые делятся на 5 без остатка.
    //Используем цикл do-while;
    public static void main(String[] args) {
        int n = 1;
        int x = 1;
            do {
                x = n * 5;
                n++;
                System.out.println(x);
            } while (x < 100);
        }
    }

