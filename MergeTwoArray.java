package com.elemica.Assign02;

// Merging Two arrays
public class MergeTwoArray {

	public static void main(String[] args) {
		// these two array is going to be merged 
		int [] firstArray= {2,4,6};
		int []secondArray= {1,3,5};
		// taking a mergeArray of length equal to sum of length of merging arrays
		int []mergeArray=new int[firstArray.length+secondArray.length];
		
		int pointerIndex=0;
		for(int i=0; i<firstArray.length; i++) {
			mergeArray[pointerIndex++]=firstArray[i];
		}
		for(int i=0; i<secondArray.length; i++) {
			mergeArray[pointerIndex++]=secondArray[i];
			
		}
		System.out.println("Here is our merged Array!!");
		for(int i=0; i<mergeArray.length; i++) {
			System.out.print(mergeArray[i]+" ");
		}
		
		

	}

}
