package array2dimensions;

import java.util.ArrayList;
import java.util.List;

public class array2dimensions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> arr = new ArrayList<>();
		
		List<Integer> row1 = new ArrayList<Integer>();
		row1.add(0);
		row1.add(-4);
		row1.add(-6);
		row1.add(0);
		row1.add(-7);
		row1.add(-6);
		arr.add(row1);
		
		List<Integer> row2 = new ArrayList<Integer>();
		row2.add(-1);
		row2.add(-2);
		row2.add(-6);
		row2.add(-8);
		row2.add(-3);
		row2.add(-1);
		arr.add(row2);
		
		List<Integer> row3 = new ArrayList<Integer>();
		row3.add(-8);
		row3.add(-4);
		row3.add(-2);
		row3.add(-8);
		row3.add(-8);
		row3.add(-6);
		arr.add(row3);
		
		List<Integer> row4 = new ArrayList<Integer>();
		row4.add(-3);
		row4.add(-1);
		row4.add(-2);
		row4.add(-5);
		row4.add(-7);
		row4.add(-4);
		arr.add(row4);
		
		List<Integer> row5 = new ArrayList<Integer>();
		row5.add(-3);
		row5.add(-5);
		row5.add(-3);
		row5.add(-6);
		row5.add(-6);
		row5.add(-6);
		arr.add(row5);
		
		List<Integer> row6 = new ArrayList<Integer>();
		row6.add(-3);
		row6.add(-6);
		row6.add(0);
		row6.add(-8);
		row6.add(-6);
		row6.add(-7);
		arr.add(row6);
		
		for(List<Integer> list : arr) {
			for(int item : list) {
				System.out.print(item+" ");
			}
			System.out.print("\n");
		} 
		
		System.out.print("\n");
		
		// System.out.println("Size: " + arr.size());
		
		System.out.print("\n");
		
		int temp = -100000000;
		int sum  = 0;
		
		int counter = 1;
		
		for(int i=0; i<=3; i++) {
			for(int j=0; j<=3; j++, counter++) {
				int topLeft      = arr.get(i).get(j);
                int topCenter    = arr.get(i).get(j+1);
                int topRight     = arr.get(i).get(j+2);
                int middleCenter = arr.get(i+1).get(j+1);
                int bottomLeft   = arr.get(i+2).get(j);
                int bottomCenter = arr.get(i+2).get(j+1);
                int bottomRight  = arr.get(i+2).get(j+2);
                
                sum = topLeft + topCenter + topRight +
                		middleCenter +
                		bottomLeft + bottomCenter + bottomRight;
                
                
                // System.out.println(counter + ". " + sum);
                
                
                	if(sum > temp ) temp = sum;
               
                
			}
		}
		
		if(sum > temp) {
			System.out.println("The highest result was: " + sum);
		} else {
			System.out.println("The highest result was: " + temp);
		}
		
		/*
		int cols = 6;
		int rows = 6;
		
		int[][] myArray = new int[cols][rows];
		
		int count = 0;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++, count++) {
				myArray[i][j] = count;
			}
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(myArray[i][j] < 10) {
					System.out.print("0");
				}
				System.out.print(myArray[i][j] + " ");
			}
			System.out.println();
		}
		
		int maxSum = Integer.MIN_VALUE;
		
		int temp = 0;
		int sum = 0;
		
		for(int i =0; i < rows - 3; i++) {
			for(int j = 1; j < cols - 3; j++) {
				int topLeft      = myArray[i][j];
				int topCenter    = myArray[i][j+1];
				int topRight     = myArray[i][j+2];
				int middleCenter = myArray[i+1][j+1];
				int bottomLeft   = myArray[i+2][j];
				int bottomCenter = myArray[i+2][j+1];
				int bottomRight  = myArray[i+2][j+2];	
				
				sum = topLeft + topCenter + topRight +
							middleCenter +
							bottomLeft + bottomCenter + bottomRight;
				*/
				// maxSum = Math.max(maxSum, sum);
				// System.out.println(sum);
				/*
				if(sum > temp) { 
					temp = sum;
				}
			}
		}
		
		System.out.println(sum);
		
		*/
	}

}
