package by.academy.lesson3;

public class Task4 {

	public static void main(String[] args) {
		int s = 37000000;
		int sec;
		int m;
		int min;
		int h;
		int hour;
		int d;
		int day;
		int week;
		int w;
		int mo;
		sec = s % 60;
		m = (s - sec) / 60;
		min = m % 60;
		h = (m - min) / 60;
		hour= h % 24;
		d = (h - hour) / 24;
		day = d % 7;
		w = (d - day) / 7;
		week = w % 30;
		mo = (w - week) / 30;
		System.out.println(
		mo + " месяцев " + week + " недель " + day + " суток " + hour +
		" часов " + min + " минут " + sec + " секунд ");

	}

}
