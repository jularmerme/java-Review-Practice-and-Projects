package net.java;

import java.util.ArrayList;
import java.util.Collections;

public class StringSubstringComparisons {
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest  = "";
		
		System.out.print("s length: " + s.length());
		
		String[] str = new String[s.length()-k+1];
		
		for(int i=0; i<=s.length()-k; i++) {
			str[i] = s.substring(i, i+k);
		}
		
		for(int i=0; i<str.length-1; i++) {
			for(int j=i+1; j<str.length; j++) {
				largest = str[i];
				str[i] = str[i+1];
				str[i+1] = largest;
			}
		}
		
		smallest = str[0];
		
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		
		String s = new String("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs");
		int k = 144;
		
		System.out.println(getSmallestAndLargest(s, k));
		
	}

}
