 package main.java.by.academy.training.cycles;

public class Task3 {
    // Передать на вход программы число От 1 до 7 в качестве аргумента.
    // Если число равно 1, выводим на консоль “Понедельник”, 2 –”Вторник” и
    //  так далее. Если 6 или 7 – “Выходной”. Используем конструкцию switch.
    public static void main(String[] args) {
        System.out.println("Entered argument is: " + args[0]);
        int x = Integer.parseInt(args[0]);
        switch (x){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Unexpected value: " + x);
        }
    }
}