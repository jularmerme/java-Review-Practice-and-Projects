import java.util.Scanner;

public class FibonacciSeries {
	static int n1 = 0, n2 = 1, n3 = 0;
	
	static void printSeries(int count) {
		if(count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printSeries(count-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to calculate the Fibonacci Series: ");
		int count = sc.nextInt();
		
		sc.close();
		
		System.out.print( n1 + " " + n2);
		printSeries(count-2);
	}

}
