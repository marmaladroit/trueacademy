package main.java.by.academy.training.cycles;

public class Task6 {
    // Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
    public static void main(String[] args) {
        char symbol = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(symbol++ + " ");
        }
    }
}
