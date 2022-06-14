package by.academy.lesson2;

class Cat {
	String nickname;
	int age;
	double money;
	char initials;
	boolean isHomeAnimal;

	public Cat() {
		super();
	}

	public Cat(String nickname, int age, double money, char initials, boolean isHomeAnimal) {
		this.nickname = nickname;
		this.age = age;
		this.money = money;
		this.initials = initials;
		this.isHomeAnimal = isHomeAnimal;
	}

	public void grow() {
		this.age = age + 1;
		System.out.println(age);

	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void sleep() {
		System.out.println("Кот спит");
	}

	public void eat() {
		System.out.println("Кот ест");
	}

	public void walk() {
		System.out.println("Кот гуляет");
	}

	public double setMoney(double money) {
		return money;
	}

	public double getMoney() {
		return money;
	}

	public void setInitials(char initials) {
		this.initials = initials;
		this.initials = nickname.charAt(0);
	}

	public char getInitials() {
		return initials;
		
	}
		
		public void setIsHomeAnimal(boolean isHomeAnimal) {
			this.isHomeAnimal = isHomeAnimal;
		}
		

	public boolean isHomeAnimal() {
		return isHomeAnimal;
	}
}
