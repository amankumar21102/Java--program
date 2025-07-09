package com.elemica.Assign02;
//compressing the string
public class CompressString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string1="aaabbbcccddd";
		String finalString="";
		int count=1;
		for(int i=0; i<string1.length(); i++) {
			if(i+1<string1.length() && string1.charAt(i)==string1.charAt(i+1)) {
				count++;
			}
			else {
				finalString+=string1.charAt(i)+String.valueOf(count);
				count=1;
			}
		}
		System.out.println(finalString);

	}

}
