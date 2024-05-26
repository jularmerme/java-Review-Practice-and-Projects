
public class ArrayExerciseTwo {
	
	public static int findNumbers(int[] nums) {
		int counter = 0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(10 < nums[i] && nums[i] < 100) {
				counter++;
			} else if(1000 < nums[i] && nums[i] < 10000) {
				counter++;
			} 
			
		}
		
		return counter;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = { 555, 901, 482, 1771 };
		
		System.out.println(findNumbers(arr));

	}

}
