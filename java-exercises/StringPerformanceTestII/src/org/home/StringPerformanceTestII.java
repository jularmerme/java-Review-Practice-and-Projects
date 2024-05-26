package org.home;

public class StringPerformanceTestII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Java");
		for(int i=0; i<10000; i++) {
			sb.append("Tpoint");
		}
		System.out.println("time taken by StringBuffer: " + (System.currentTimeMillis() - startTime)+"ms");
		
		startTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Java");
		for(int i=0; i<10000; i++) {
			sb1.append("Tpoint");
		}
		System.out.println("time taken by StringBuilder: " + (System.currentTimeMillis() - startTime)+"ms");

	}

}
