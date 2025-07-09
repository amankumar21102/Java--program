package com.elemica.Assign02;
// Sorting the Array in ascending and descending order
public class SortArray {

	public static void main(String[] args) {
		
		int unsortedArray[]= {10, 4, 3, 6, 7, 28, 90, 12, 13, 56};
		// sorting the array in ascending order by doing the swaps 
		for(int i=0; i<unsortedArray.length; i++) {
			for(int j=i+1; j<unsortedArray.length; j++) {
				if(unsortedArray[i]>unsortedArray[j]) {
					int temp=unsortedArray[i];
					unsortedArray[i]=unsortedArray[j];
					unsortedArray[j]=temp;
				}
				
			}
		}
		System.out.println("Here is the Array sorted in asceneding oreder!");
		for(int i=0; i<unsortedArray.length; i++) {
			System.out.print(unsortedArray[i]+" ");
		}
		System.out.println();// moving to next line
		
		// sorting the array in descending order by doing the swaps
		for(int i=0; i<unsortedArray.length; i++) {
			for(int j=i+1; j<unsortedArray.length; j++) {
				if(unsortedArray[i]<unsortedArray[j]) {
					int temp=unsortedArray[i];
					unsortedArray[i]=unsortedArray[j];
					unsortedArray[j]=temp;
				}
				
			}
		}
		System.out.println("Here is the Array sorted in desceneding oreder!");
		for(int i=0; i<unsortedArray.length; i++) {
			System.out.print(unsortedArray[i]+" ");
		}

	}

}
