
public class Scope {
	
	private int[] elements = {1, 2, 5};
	int maximumDifference;
	int n = 1;
	
	int res  = 0;
	int temp = -9999999;
	
	void computeDifference() {
		for(int i=0; i <= elements.length-2; i++, n++) {
			for(int j=n; j<=elements.length-1; j++) {
				res = Math.abs(elements[i] - elements[j]);
				System.out.println(elements[i] + ", " + elements[j] + " = " + res);
				temp = res > temp ? res : temp;
			}
		}
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scope s = new Scope();
		s.computeDifference();

	}

}
