package by.academy.lesson4;

import java.util.Scanner;

public class ClassWork2 {
	public static void main(String[] args) {

		long mult = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();

		for (long i = 1; i <= n; i++) {
			mult *= i;
		}
		sc.close();

		System.out.println(mult);	
	}
}

