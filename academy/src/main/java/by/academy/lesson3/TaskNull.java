package by.academy.lesson3;

import java.util.Scanner;

public class TaskNull {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String month = sc.next();
//		
//		if(sc.hasNextInt()) {
//		int str = sc.nextInt();
//		System.out.println("Your string is:" + str);
//		} else { 
//			String str = sc.next();
//			System.out.println("Your string is:" + str);
//			
//		}

		month = month.toLowerCase();
		switch (month) {
		case "������":
			System.out.println("1 �����");
			break;
		case "�������":
			System.out.println("2 �����");
			break;
		case "����":
			System.out.println("3 �����");
			break;
		case "������":
			System.out.println("4 �����");
			break;
		case "���":
			System.out.println("5 �����");
			break;
		case "����":
			System.out.println("6 �����");
			break;

		default:
			System.out.println("��� �� �����");

		}

		sc.close();
	}

}
