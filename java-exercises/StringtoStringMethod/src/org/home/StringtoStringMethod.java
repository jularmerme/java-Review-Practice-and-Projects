package org.home;

public class StringtoStringMethod {
	
	int rollno;
	String name;
	String city;
	
	public StringtoStringMethod(int rollno, String name, String city) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "StringtoStringMethod [rollno=" + rollno + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringtoStringMethod methodOne = new StringtoStringMethod(101, "Language", "Java");
		StringtoStringMethod methodTwo = new StringtoStringMethod(102, "OOP", "Python");
		
		System.out.println(methodOne);
		
		
		
		System.out.println(methodTwo);

	}

}
