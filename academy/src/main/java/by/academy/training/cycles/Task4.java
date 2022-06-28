package main.java.by.academy.training.cycles;

public class Task4 {
    // Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while.
    public static void main(String[] args) {
        int n = 0;
        while (n <= 10 ) {
            System.out.println("Task" + n++);
        }
    }
}
