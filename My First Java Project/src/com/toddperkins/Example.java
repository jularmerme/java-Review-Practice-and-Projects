package com.toddperkins;

import java.nio.file.FileSystems;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "American Woodmark isn’t just a place to work — it’s a place to grow.";
		// System.out.println(myString);
		
		// printS("static method");

		Example myReview = new Example();
		// myReview.print("instance method");
		
		// Arrays
		/*
		 * String[] breakfast = new String[3]; breakfast[0] = "Oatmeal"; breakfast[1] =
		 * "Milk"; breakfast[2] = "Eggs";
		 * 
		 * System.out.println(breakfast[0]);
		 */
		
		/*
		 * for(int i=0;i<breakfast.length;i++) { System.out.println(breakfast[i]); }
		 */
		
		// Conditional Statement
		
		/*MyClass mc = new MyClass();
		mc.myMethod();
		mc.myInt =  10;
		System.out.println(mc.myInt);*/
		
		// Input and output
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.nextLine();
		System.out.println("Hello " + name);
		sc.close();*/
		
		// Read data from a file
		/*
		 * Path file = FileSystems.getDefault().getPath("", "file.txt"); List<String>
		 * lines = Files.readAllLines(file);
		 */
		/*
		 * for(int i=0; i < lines.size(); i++) { System.out.println(lines.get(i)); }
		 */
		// lines.forEach(System.out::println);
		
		try {
			loadFile("Files.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		
	}
	
  static void loadFile(String fileName) throws IOException {
  	Path file = FileSystems.getDefault().getPath("", "file.txt");
		List<String> lines = Files.readAllLines(file);
		/*
		 * for(int i=0; i < lines.size(); i++) { System.out.println(lines.get(i)); }
		 */
		lines.forEach(System.out::println);
  }
	
	void print(String data) {
		System.out.println(data);
	}
	
	static void printS(String data) {
		System.out.println(data);
	}

}
	