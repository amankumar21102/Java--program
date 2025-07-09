package com.elemica.Assign02;

public class BufferString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="Aman Badiyar";
      StringBuffer sb= new StringBuffer(name);
      int spaceIndex=sb.indexOf(" ");
      
      String firstName=sb.substring(0,spaceIndex);
      String lastName=sb.substring(spaceIndex+1);
      
      StringBuffer swapped=new StringBuffer();
      swapped.append(lastName);
      swapped.append(",");
      swapped.append(firstName);
      System.out.println(swapped);
      
      int commaIndex=swapped.indexOf(",");
      String last=swapped.substring(0,commaIndex);
      String first=swapped.substring(commaIndex+1);
      StringBuffer original=new StringBuffer();
      original.append(first);
      original.append(" ");
      original.append(last);
      System.out.println(original);
      
      
      
      

	}

}
