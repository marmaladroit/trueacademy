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
		case "€нварь":
			System.out.println("1 мес€ц");
			break;
		case "февраль":
			System.out.println("2 мес€ц");
			break;
		case "март":
			System.out.println("3 мес€ц");
			break;
		case "апрель":
			System.out.println("4 мес€ц");
			break;
		case "май":
			System.out.println("5 мес€ц");
			break;
		case "июнь":
			System.out.println("6 мес€ц");
			break;

		default:
			System.out.println("Ёто не мес€ц");

		}

		sc.close();
	}

}
