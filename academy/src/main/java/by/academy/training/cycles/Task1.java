package main.java.by.academy.training.cycles;

public class Task1 {

    //Передать на вход программы число в качестве аргумента.
    //Если оно нечетное, распечатать его. Используем оператор if.
    //Используйте метод Integer.parseInt() для преобразования из String в int.

    public static void main(String[] args) {
            System.out.println("Entered argument is: " + args[0]);
            int x = Integer.parseInt(args[0]);

            if (x % 2 != 0) {
                System.out.println("Your argument is uneven");
            } else if (x % 2 == 0) {
                System.out.println("Your argument is even");
            } else
                System.out.println("Your argument is incorrect");
        }
    }


