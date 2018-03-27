package com.coreprograms;

public class BytestoString {

	public static void main(String[] args) {
		String s = "this is my program";
		byte[] bytes = s.getBytes();
		
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().maxMemory());
		System.out.println("Plain text " + s);
		System.out.println("Bytes " + bytes);
		System.out.println("Bytes to string " + bytes.toString());
		
		String s1= new String(bytes);
		System.out.println("String obj " + s1);
	}
	
}
