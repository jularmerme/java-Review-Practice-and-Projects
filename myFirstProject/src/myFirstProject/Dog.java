package myFirstProject;

public class Dog {
	String breed;
	int age;
	String color;
	
	Dog(String firstArg, int b, String c) {
		this.breed = firstArg;
		this.age = b;
		this.color = c;
	}
	
	void barking() {
		System.out.println("The Dog is barking");
	}
	
	void hungry() {
		System.out.println("The Dog is hungry");
	}
	
	void sleeping() {
		System.out.println("The dog is sleeping");
	}
}
