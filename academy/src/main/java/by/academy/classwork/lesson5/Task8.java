package main.java.by.academy.classwork.lesson5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Изменить регулярное выражение в примере для нахождения строк
// cab, ccab, cccab.

public class Task8 {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c*a*b");

        Matcher matcher = pattern.matcher("aaab");
        Matcher matcher1 = pattern.matcher("cab");
        Matcher matcher2 = pattern.matcher("ccab");
        Matcher matcher3 = pattern.matcher("cccab");

        boolean b = matcher.matches();
        boolean c = matcher1.matches();
        boolean d = matcher2.matches();
        boolean e = matcher3.matches();

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}


