package main.java.by.academy.homework.hometask1;
import java.util.Scanner;
public class exercise2 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data type: ");
            String data = sc.nextLine();

            System.out.println("Enter variable:");
            switch (data) {

                case "Integer":
                case "integer":
                case "Int":
                case "int": {
                    if (sc.hasNextInt()) {
                        int x = sc.nextInt();
                        System.out.println(x % 2);
                    } else System.out.println("The data is incorrect");
                }
                    break;

                case "Double":
                case "double": {
                    if (sc.hasNextDouble()) {
                        double x = sc.nextDouble();
                        System.out.println( x * 0.7 );
                    }
                    else System.out.println("The data is incorrect");
                }
                break;

                case "Float":
                case "float":{
                    if (sc.hasNextFloat()) {
                        float x = sc.nextFloat();
                        System.out.println( Math.pow(x,2) );
                    }
                    else System.out.println("The data is incorrect");
                }
                break;

                case "Char":
                case "char": {
                    char x = sc.next().charAt(0);
                    System.out.println( x + " equals " + (int)x );
                }
                break;

                case "string":
                case "String": {
                    String x = sc.nextLine();
                    System.out.println("Hello " + x);
                }
                break;

                default: System.out.println("Unsupported type");

            }
            sc.close();
        }

    }