package org.home;

public class StringHashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("HashCode test of String:");
		String str = "Java";
		System.out.println(str.hashCode());
		str = str + "tpoint";
		System.out.println(str.hashCode());
		
		System.out.println("HashCode test of StringBuffer");
		StringBuffer sb = new StringBuffer("Java");
		System.out.println(sb.hashCode());
		sb.append("tpoint");
		System.out.println(sb.hashCode());

	}

}
