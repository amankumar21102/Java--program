package com.elemica.Assign02;

public class FrequencyOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="AMANkuamrbadiyar";
		int arr[]=new int[256];
		
		for(int i=0; i<name.length(); ++i) {
			arr[name.charAt(i)]++;
		}
		for(int i=0; i<256; i++) {
			if(arr[i]>0) {
				System.out.print((char)(i)+"-"+arr[i]+" ");
			}
		}

	}

}
