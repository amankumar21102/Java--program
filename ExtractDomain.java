package com.elemica.Assign02;
//Finding Domain name 
public class ExtractDomain {

	public static void main(String[] args) {
		String email="badiyaraman21102@gmail.com";
		String domainName="";
		boolean found=false;
		for(int i=0; i<email.length(); i++) {
			if(email.charAt(i)=='@') {
				found=true;
				continue;
			}
			if(found) {
				domainName=domainName+email.charAt(i);
			}
		}
		
        System.out.println(domainName);
	}

}
