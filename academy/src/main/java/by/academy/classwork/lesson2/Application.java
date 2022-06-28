package by.academy.lesson2;

public class Application {

	public static void main(String[] args) {
		Cat anon = new Cat();
		anon.age = 1;
		Cat shumi = new Cat();
		shumi.nickname = "Shumi";

		anon.grow();
		anon.grow();
		anon.grow();
		shumi.eat();
		shumi.sleep();
		shumi.walk();

	}
}
