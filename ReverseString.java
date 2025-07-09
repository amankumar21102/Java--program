package com.elemica.Assign02;
// reversing the String 
public class ReverseString {

	public static void main(String[] args) {
		String name="AMAN";
		String revName="";// Taken a blank string
		for(int i=name.length()-1; i>=0; i--) {
		    revName=revName+name.charAt(i);// adding character in reverse order 
		}
		System.out.println("Printing the reverse string");
		System.out.println(revName);

	}

}
