import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 439;
		int counter = 0;
		int temp = 0;
		
		List<Integer> binary = new ArrayList<>();
		
		while( n > 0 ) {
			int r = n % 2;
			
			n = n / 2;
			binary.add(r);
			
		}
		
		Collections.reverse(binary);
		
		binary.forEach(b -> System.out.print(b));
		
		for(int i : binary) {
			if(i == 1) {
				counter++;
				System.out.print("\nCounter Increased by 1");
			} else {
				if(counter > temp) temp = counter;
				counter = 0;
				System.out.println("\nCounter set to 0");
			}
		}
		
		if(counter > temp) {
			System.out.print("\n" + counter);
		} else {
			System.out.print("\n" + temp);
		}
		

	}

}
