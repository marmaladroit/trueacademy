package by.academy.lesson4;

import java.util.Scanner;

public class ClassWork4 {

	public static void main(String [] arg) {
	int zero = 0;
	int positive = 0;
	int negative = 0;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number n ");
	int n = sc.nextInt();
	for(int i = 1;i<=n;i++)
	{
		System.out.println("Next number");
		int number = sc.nextInt();
		if (number < 0) {
			negative++;
		} else if (number == 0) {
			zero++;
		} else {
			positive++;
		}
	} 
	System.out.println("You entered"+negative+" numbers");
	System.out.println("You entered"+positive+" numbers");
	System.out.println("You entered"+zero+" numbers");
	sc.close();
}
}
