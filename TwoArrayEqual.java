package com.elemica.Assign02;
// Checking two array are equal or not
public class TwoArrayEqual {

	public static void main(String[] args) {
		int firstArray[]= {1,2,4,5,6};
		int secondArray[]= {1,2,4,5,6};
		
		boolean equal=true;
		// checking if the size is not equal it can't be equal 
		if(firstArray.length!=secondArray.length) {
			equal=false;
		}
		
		// if size is equal then we will look each element 
		
		if(equal) {
			for(int i=0; i<firstArray.length; i++) {
				if(firstArray[i]!=secondArray[i]) {
					equal=false;
					break;
				}
			}
		}
		// if each element is equal
		if(equal) {
			System.out.println("These two arrays are Equal!!");
		}
		//if there is even one element is not equal
		else {
			System.out.println("These two arrays are Not Equal!!");
		}
	}

}
