package by.academy.lesson4;

import java.util.Scanner;

public class ClassWork1 {
	public static void main(String[] args) {

		long summ = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int n = sc.nextInt();

		for (long i = 1; i <= n; i++) {
			summ += i;
		}
		sc.close();

		System.out.println(summ);	
	}
}
