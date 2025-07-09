package com.elemica.Assign02;
// Removing the Dublicates
public class RemoveDublicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="AMANkuamrbadiyar";
		int arr[]=new int[256];
		String newName="";
		for(int i=0; i<name.length(); ++i) {
			if(arr[name.charAt(i)]==0) {
				newName=newName+name.charAt(i);
				arr[name.charAt(i)]++;
			}
		}
		System.out.println(newName);

}
}
