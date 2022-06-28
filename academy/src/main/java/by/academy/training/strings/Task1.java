package main.java.by.academy.training.strings;


public class Task1 {
    //a) Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
    //б) Распечатать последний символ строки. Используем метод String.charAt().
    //в) Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
    //г) Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
    //д) Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
    //e) Найти позицию подстроки “Java” в строке “I like Java!!!”.
    //ж) Заменить все символы “а” на “о”.
    //з) Преобразуйте строку к верхнему регистру.
    //и) Преобразуйте строку к нижнему регистру.
    //к) Вырезать строку Java c помощью метода String.substring().
    public static void main(String[] args) {

        String str1 = "I like Java";

        System.out.println(str1.charAt(10));
        System.out.println(str1.endsWith("!!!"));
        System.out.println(str1.startsWith("I like"));
        System.out.println(str1.contains("Java"));

        int index = str1.lastIndexOf("Java");

        if(index == - 1){
            System.out.println("This statement hasn't been found");
        } else {
            System.out.println("Statement's Java place  " + index);
        }

        System.out.println(str1.replace('a', 'o'));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());


        System.out.println(str1.substring(0, 6));
    }
    }


