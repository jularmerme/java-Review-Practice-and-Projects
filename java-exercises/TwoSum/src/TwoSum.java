
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-1, -2, -3, -4, -5};
		int target = -8;
		//boolean found = false;
		
		int[] indexes = new int[2];

        for(int i=0; i < nums.length-1; i++) {
        	//if(found) break;
            for(int j=1; j < nums.length; j++) {
            	System.out.println(nums[i] + " + " + nums[j] + " = " + (nums[i]+nums[j]));
                if(nums[i] + nums[j] == target && i != j) {
                    indexes[0] = i;
                    indexes[1] = j;
                    //found = true;
                    break;
                }
                
            }
        }
        
        
        System.out.println("[" + indexes[0] + ", " + indexes[1] + "]");

	}

}
