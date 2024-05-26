package org.home;

public class Palindrome {
	
	static public boolean isPalindrome(String str) {
		int size = str.length();
		
		if(size == 0 || size == 1) return true;
		
		String f = str.substring(0, 1);
		String l = str.substring(size -1);
		
		if(l.equals(f)) {
			return isPalindrome(str.substring(1, size-1));
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		
		if(isPalindrome(s)) {
			System.out.println(s + " is a Palindrome");
		} else {
			System.out.println(s + " is not a Palindrome");
		}
	}

}
