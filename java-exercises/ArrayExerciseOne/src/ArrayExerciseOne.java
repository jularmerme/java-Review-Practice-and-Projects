
public class ArrayExerciseOne {
	
	public static int findMaxConsecutivesOnes(int[] nums) {
		int count = 0;
		int temp = 0;
	
		for(int i=0; i < nums.length; i++) {
			if(nums[i] == 1) {
				count++;
				if(temp < count) 
					temp = count;
			} else {
				count = 0;
			}
			if(count > temp) temp = count; 
				
		}
		
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 1, 0, 1, 1, 1};
		
		System.out.println(findMaxConsecutivesOnes(a));
		
	}

}
