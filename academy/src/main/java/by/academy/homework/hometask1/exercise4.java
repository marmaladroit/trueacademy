package main.java.by.academy.homework.hometask1;

public class exercise4 {
    public static void main(String[] args) {
        int x = 2;
        long res;
        int power = 1;
        do {
            power++;
            res =(long) x * power;
            System.out.println(x + " ^ " + power + " = " + res);
        } while (res < 1_000_000);
    }
}
