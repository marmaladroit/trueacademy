package main.java.by.academy.training.strings;

public class Task2 {

    //а) Дано два числа, например 3 и 56, необходимо составить следующие строки:
    // 3 + 56 = 59
    // 3 – 56 = -53
    // 3 * 56 = 168.
    // Используем метод StringBuilder.append().
    //б) Замените символ “=” на слово “равно”.
    //Используйте методы StringBuilder.insert(), StringBuilder.deleteCharAt().
    //в) Замените символ “=” на слово “равно”.
    //Используйте методы StringBuilder.replace().
    public static void main(String[] args) {

        StringBuilder stringBuilder1  = str1 (3,56);
        System.out.println(stringBuilder1);

        mod(stringBuilder1);
        System.out.println(stringBuilder1);

        mod2(stringBuilder1);
        System.out.println(stringBuilder1);
    }
    private static StringBuilder str1(int a, int b) {
        StringBuilder result = new StringBuilder();
        result.append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n")
        .append(a).append(" - ").append(b).append(" = ").append(a - b).append("\n")
                .append(a).append(" * ").append(b).append(" = ").append(a * b).append("\n");
        return result;
    }
    private static StringBuilder mod(StringBuilder stringBuilder) {
        int ind;
        while ((ind = stringBuilder.indexOf("=")) != -1) {
            stringBuilder.deleteCharAt(ind);
            stringBuilder.insert(ind, " equals ");
        }
        return stringBuilder;
        }
    private static StringBuilder mod2(StringBuilder stringBuilder) {
        int pos;
        while ((pos = stringBuilder.indexOf("3")) != -1) {
            stringBuilder.replace(pos, pos + 1, " 2 ");
        }
        return stringBuilder;

    }

    }
