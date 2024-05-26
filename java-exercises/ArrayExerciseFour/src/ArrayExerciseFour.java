
public class ArrayExerciseFour {
	
	static void duplicateZeros(int[] arr) {
		int temp = 0, temp2 = 0;
		
		
		for(int j=0; j < arr.length-1; j++) {
			if(arr[j] == 0 && j < arr.length-1) {
				for(int i=arr.length-1; i > j + 1 ; i--) {
					arr[i] = arr[i - 1]; 
				}
				arr[j+1] = 0;
				j++;
			}
		}
		
		
		for(int i: arr) System.out.print(i + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		
		duplicateZeros(arr);

	}

}
