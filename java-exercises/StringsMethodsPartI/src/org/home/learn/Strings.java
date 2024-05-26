package org.home.learn;

public class Strings {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/***
		 * String => String is basically an object that represents sequence of char values. An array of characters works same as java string.
		 */
		
		// 1. String created using string Literal
		String literal = "literal string";
		String literalLowercase = "literal string";
		String literalCapitalized = "LITERAL STRING";
		
		// 2. String created using new keyword
		String newKeyword = new String("new keyword string");
		
		char[] sToC = new char[literal.length()];
		
		// 1. charAt()
		System.out.println("\n\n***** 1. charAt() *****\n");
		for(int i=0; i<sToC.length; i++) {
			sToC[i] = literal.charAt(i);
		}
		
		for(int i=0; i<sToC.length; i++) {
			System.out.print("CharAt["+i+"]: "+sToC[i]+"\n");
		}
		
		System.out.println("\nString #1: Using literal: " + literal);
		System.out.println("String #2: Using the new Keyword: " + newKeyword);
		
		// 2. compareTo()
		System.out.println("\n\n***** 2. compareTo(): Let's compare literal vs New Keyword Strings. *****");
		
		if(literal.compareTo(newKeyword) > 0) {
			System.out.println("Literal is higher than NewKeyword");
		} else if(literal.compareTo(newKeyword) < 0) {
			System.out.println("NewKeyword is higher than Literal");
		} else {
			System.out.println("Literal and NewKeyword are the same");
		}
		
		// 3. concat()
		System.out.println("\n\n***** 3. Let's use concat() *****");
		literal.concat(" : is the first option");
		literal = literal.concat(" : this is the second option");
		
		System.out.println(literal);
		
		// 4. contains()
		System.out.println("\n\n***** 4. Let's use contains() *****");
		System.out.println(literal.contains("is"));
		System.out.println(newKeyword.contains("is"));
		
		// 5. endsWith()
		System.out.println("\n\n***** 5. Let's use endsWith() *****");
		System.out.println(literal.endsWith("the"));
		System.out.println(literal.endsWith("on"));
		
		// 6. equals()
		System.out.println("\n\n***** 4. Let's use equals() *****");
		System.out.println(literal.equals(newKeyword));
		
		// 7. equalsIgnoreCase()
		System.out.println("\n\n***** 4. Let's use equalsIgnoreCase() *****");
		System.out.println(literalLowercase.equalsIgnoreCase(literalCapitalized));
		System.out.println(literal.equalsIgnoreCase(newKeyword));
		
		// 8. format()
		System.out.println("\n\n***** 4. Let's add some format with format() *****");
		String sf1 = String.format("This language is %s", "Java");
		String sf2 = String.format("value is %f", 32.33434);
		System.out.println(sf1);
		System.out.println(sf2);
		
		// 9. getbytes()
		System.out.println("\n\n***** 4. Let's add some format with format() *****");
		byte[] barr = literal.getBytes();
		// byte[] barr = literal.getBytes("UTF-16");
		// byte[] barr = literal.getBytes("UTF-16BE");
		//byte[] barr = literal.getBytes("ISO-8859-1");
		for(int i=0; i<barr.length; i++) {
			System.out.println(barr[i]);
		}
		System.out.println(new String(barr));
		
		// 10. getChars()
		System.out.println("\n\n***** 4. Let's create an array from the String *****");
		char[] ch = new char[10];
		try {
			literal.getChars(6, 16, ch, 0);
			System.out.println(ch);
		} catch(Exception e) {
			System.out.println(e);
		}
		
		/***
		 * 11. indexOf(): it returns the position of the first ocurrence of the specified character or string in a specified string.
		 */
		System.out.println("\n\n***** 4. Let's find a char or string in another string *****");
		System.out.println(literal + " - indexOf(t): " + literal.indexOf("t"));
		System.out.println(literal + " - indexOf(t, 6): " + literal.indexOf("t", 3));
		System.out.println(literal + " - indexOf(t, 9): " + literal.indexOf("t", 10));
		
		/***
		 * 12. intern(): it returns the interned string. it returns the canonical representation of string
		 */
		System.out.println("\n\n***** 4. Let's create String from pool with intern() *****");
		String str = "I'm doing great!!!";
		String str1 = str.intern();
		String str2 = new String("intern() was used before");
		String str3 = new String("");
		
		System.out.println(str == str1);
		System.out.println(str1 == str2);
		
		/**
		 * 13. isEmpty(): Checks if the string is empty or not.
		 */
		System.out.println("\n\n***** 4. Let's check the String *****");
		System.out.println("Is Literal String empty: " + literal.isEmpty());
		System.out.println("Is str3 String empty: " + str3.isEmpty());
		
	}

}
