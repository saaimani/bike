package com.tcs;

public class BikeDetails {

	public static void main(String[]args) {
		String s="ICICI@1234@TAM";
		//to separately a String from s using char
		String[]h=s.split("@");
		System.out.println(h[1]);
	}

	

	  
}
