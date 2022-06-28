
package main.java.by.academy.training.operators;

  public class Task3 {
//3. Создайте число. Определите, является ли число четным или
//не четным, вывести текстовое сообщение.

    public static void main(String[] args) {
   int a = (int) (Math.random() * 100);
   double b = a % 2;
   if (b == 0) {
       System.out.println ("The number is even " + a);
   } else System.out.println("The number is uneven " + a);
}
}
