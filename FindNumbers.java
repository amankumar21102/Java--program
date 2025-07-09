package com.elemica.Assign02;
// Find third highest and second lowest numbers
public class FindNumbers {

	public static void main(String[] args) {
		int numbers[]= {10, 4, 3, 6, 7, 28, 90, 12, 13, 56};
		// Here sorting the numbers
		for(int i=0; i<numbers.length; i++) {
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[i]>numbers[j]) {
					int temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
				
			}
		}
		// Just selecting third highest number from the sorted numbers
		System.out.println("Third highest number is "+numbers[numbers.length-3]);
		// Just selecting second lowest number from the sorted numbers
		System.out.println("Second Lowest number is "+numbers[1]);
		

	}

}
