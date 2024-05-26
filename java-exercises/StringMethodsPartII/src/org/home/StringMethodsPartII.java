package org.home;

public class StringMethodsPartII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strOne = "Java";
		String strTwo = new String("javaScript");
		String literal = "it returns the last index position for the given char value";
		
		String[] arr = { "string", "int", "boolean" };
		
		/**
		 * 14. join(): it returns a string joined with a given delimiter. 
		 */
		System.out.println("***** 14. Let's Join the string with join() *****");
		String joined = String.join("-", "Java", "javascript", "PHP", "wordPress");
		System.out.println(joined);
		
		String joinString = String.join(" | ", arr);
		System.out.println(joinString);
		
		/**
		 * 15. lastIndexOf(): returns the last index of the given character value or substring
		 */
		System.out.println("\n***** 15. Let's find the lastIndexOf(Char|String, POS) *****");
		System.out.println("The last index of the char i in the sentence is: " + literal.lastIndexOf("i"));
		System.out.println("The last index of the char the in the sentence is: " + literal.lastIndexOf("the"));
		System.out.println("The last index of the char the in the sentence is: " + literal.lastIndexOf("the", 20));
		System.out.println("The last index of the char i in the sentence is: " + literal.lastIndexOf("i", 19));
		
		/**
		 * 16. length(): returns the string length
		 */
		System.out.println("\n***** 16. How long is the String? Use length *****");
		System.out.println("The length of strOne is: " + strOne.length());
		System.out.println("The length of strTwo is: " + strTwo.length());
		System.out.println("The length of literal is: " + literal.length());
		
		/**
		 * 17. replace(): returns a string replacing all the old char or charSequence to new char or charSequence
		 */
		System.out.println("\n***** 17. Let's replace some chars *****");
		System.out.println(strOne.replace("a", "o"));
		System.out.println(literal.replace("the", "THE"));
		
		/**
		 * 18. replaceAll(): returns a string replacing all the sequence of characters matching regex and replacement string
		 */
		System.out.println("\n***** 18. Let's replace some chars using regex *****");
		System.out.println(literal.replaceAll("\\s", ""));
		System.out.println(literal.replaceAll("", " "));
		
		/**
		 * 19. split(): it splits the string against given regular expression and returns a char array
		 */
		System.out.println("\n***** 19. Let's divide the Strings in a char array *****");
		System.out.println("Original String: " + literal);
		String[] words = literal.split("\\s");
		for(String s: words) System.out.println(s);
		
		
		
		/***
		 * 20. startsWith(): Method checks if string starts with the given prefix.
		 */
		System.out.println("\n***** 20. Checking the String first word or char *****");
		System.out.println("Original String: " + literal);
		System.out.println("Checking if string starts with 'The': " + literal.startsWith("The"));
		System.out.println("Checking if string starts with 'It': " + literal.startsWith("It"));
		System.out.println("Checking if string starts with 'it': " + literal.startsWith("it"));
		System.out.println("Checking if string starts with 'ret': " + literal.startsWith("ret", 3));
		
		/**
		 * 21. substring(): returns part of a string
		 */
		System.out.println("\n***** 21. Creating a substring from the String *****");
		System.out.println("Original String: " + literal);
		System.out.println("Substring from initialPos: 5 to endPos: 15: " + literal.substring(5, 15));
		System.out.println("Substring from initialPos 8: " + literal.substring(8));
		
		/**
		 * 22. toCharArray(): Method converst this string into character array.
		 */
		System.out.println("\n***** 22. Convert the string into array *****");
		System.out.println("Original String: " + literal);
		char[] chars = literal.toCharArray();
		for(char c: chars)
		System.out.print(c + "  ");
		System.out.println();
		
		/**
		 * 23. toLowerCase(): Method returns the string in lowercase letter. 
		 */
		System.out.println("\n***** 23. Convert the string lowercase *****");
		String toLowerCase = "JAVA IS EASY";
		System.out.println("Original String: " + toLowerCase);
		System.out.println("Original String: " + toLowerCase.toLowerCase());
		
		
		/**
		 * 24. toUpperCase(): Method returns the string in uppercase letter
		 */
		System.out.println("\n***** 24. Convert the string uppercase *****");
		System.out.println("Original String: " + literal);
		System.out.println("Original String: " + literal.toUpperCase());
		
		/**
		 * 25. trim(): Method eliminates leading and trailing spaces
		 */
		System.out.println("\n***** 24. Eliminating spaces before and after the string *****");
		String noSpaces = " there are spaces before and after ";
		System.out.println("Original String: " + noSpaces);
		System.out.println(noSpaces.trim());
		
		/**
		 * 26. valueOf(): Methods converts different types of values into String
		 */
		System.out.println("\n***** 26. Converting any data type into String *****");
		int number = 10;
		boolean isTrue = false;
		char theChar = 'b';
		String numberToString = String.valueOf(number);
		String booleanToString = String.valueOf(isTrue);
		String charToString = String.valueOf(theChar);
		System.out.println("The number " + number + " converted to String is equal to " + numberToString + 10);
		System.out.println("The boolean " + isTrue + " converted to String is equal to " + booleanToString + 10);
		System.out.println("The char " + theChar + " converted to String is equal to " + charToString + 10);
		
	}

}
