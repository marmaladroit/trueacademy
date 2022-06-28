package main.java.by.academy.training.cycles;

public class Task8 {
    //Реализовать подсчет факториала используя цикл for.
    //	n! = 1*2*...*n;
    //	0! = 1;
    //	5! = 1*2*3*4*5;
    //Число n задается случайным образом (используйте Math.random()).
    public static void main(String[] args) {
        int n = (int) Math.random() * 5;
        int result = 1;
        for (int a = 1; a <= n; a ++) {
            result = result * a;
        }
        System.out.println("Your number was, " + n);
        System.out.println(result);
    }
}
