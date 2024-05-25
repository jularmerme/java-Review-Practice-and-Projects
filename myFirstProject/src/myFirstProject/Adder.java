package myFirstProject;

public class Adder {
	
	// Method Overloading - Changing data type of arguments
	static int add(int a, int b) {
		return a+b;
	}
	static double add(double a, double b) {
		return a+b;
	}
	
	//Method Overloading - Changing the number of arguments
	static int add(int a, int b, int c) {
		return a + b + c;
	}
}
