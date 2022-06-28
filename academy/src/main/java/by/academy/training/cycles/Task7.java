/* package main.java.by.academy.training.cycles;

public class task7 {

    //Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
    // В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
    //
    //метод blink, который будет мигать лампочками гирлянды один раз (операция ~);
    //метод run, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
    //метод isFirstLampOn, который будет выяснять включена ли лампочка в первой позиции (наложение маски с помощью &);
    //метод, который будет распечатывать текущее состояние гирлянды.
    // Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
    //Используйте побитовые операции.
    // Переписать гирлянду используя оператор switch для выбора нужной операции.
    // Помощью класса Scanner введите число от 1 до 4.
    //Если введено число 1 - выполните метод мигания,
    // 2 - проверку первой лампочки, 3 - метод бегущей строки, 4 - вывод состояния гирлянды на консоль.
    //Для выбора режима используйте оператор switch.
    //Измените метод мигания: метод должен мигнуть гирляндой 10 раз. Используем оператор for.
    //Измените метод бегущей строки: метод должен выполнить операцию 10 раз. Используем оператор for.
    public static void main(String[] args) {
        int a = 108;
        int b = 0;
        int c = 0;
        int d = 0;
        int mask = 100;
        blink(a);
        run(a,b);
        isFirstLampOn(a, mask, c);
        check (a);
      //  System.out.println(Integer.toBinaryString(a));
    }

    static void blink(int a) {
        a = ~a;
      //  System.out.println( Integer.toBinaryString(a));
    }
    static void run(int a, int b) {
        b = a >> 1;
       // System.out.println( Integer.toBinaryString(b));
    }
    static void isFirstLampOn(int a, int mask, int c) {
        c = a & mask;
      //  System.out.println( Integer.toBinaryString(c));
    }
    static String check(int a) {
        return Integer.toBinaryString(a);
    }
}
 */