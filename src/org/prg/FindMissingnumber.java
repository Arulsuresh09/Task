package org.prg;

public class FindMissingnumber {
	
	public static void main(String[] args) {
		
		int[] inputArray = {1,3,4,5,6,7,8,9,10};
		int missingnum = findMissingNumber(inputArray);
		System.out.println("Missing Number: " +missingnum);
	}
	
	public static int findMissingNumber(int[] inputArray){
		
		int n = inputArray.length + 1;
		int expectedsum = n*(n+1)/2;
		int actualsum = 0;
		
		for(int num : inputArray ) {
			actualsum += num;
		}
		return expectedsum - actualsum;	
	}
}
