import java.util.Arrays;

public class ArrayExerciseThree {
	
	static int[] sortedSquares(int[] nums) {
		
		for(int i=0; i < nums.length; i++) {
			nums[i] = (int) Math.pow(nums[i], 2);
		}
		
		Arrays.sort(nums);
		
		return nums;
		
	}
	
	static void printArray(int[] nums) {
		for(int i: nums) System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { -4, -1, 0, 3, 10 };
		
		printArray(sortedSquares(a));

	}

}
