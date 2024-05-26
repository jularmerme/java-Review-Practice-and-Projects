package net.java.learn;

import java.util.Arrays;

public class StringAnagram {
	
	public static boolean isAnagram(String str1, String str2) {
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		
		if(str1.length() != str2.length()) return false;
		
		int[] count = new int[256];
		
		for(int i=0; i<str1.length(); i++) {
			count[str1Array[i]]++;
			count[str2Array[i]]--;
		}
		
		for(int i=0; i<256; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
			
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		System.out.println(isAnagram("naranja", "maranaia"));
		
	
		

	}

}
