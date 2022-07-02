package main.java.by.academy.classwork.lesson5;

//Дана строка “Versions: Java  5, Java 6, Java   7, Java 8, Java 12.”
//Найти все подстроки "Java <X>" и распечатать их.

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task10 {
    public static void main(String[] args) {
        String str = new String("Versions: Java  5, Java 6, Java   7, Java 8, Java 12.");
        Pattern pattern = Pattern.compile("Java \\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        }
    }





