package com.coreprograms;

import java.util.ArrayList;

public class DuplicateInString {

	public static void main(String[] args) {
		
		String s = "Java application";
		ArrayList<Character> al = new ArrayList<>();
		int count;
		
		for(int i=0;i<s.length();i++) {
              count = 0;
			for(int j=i;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>=2 && !al.contains(s.charAt(i))) {
				al.add(s.charAt(i));
				System.out.println("count is " + count + " repeated character is ");
			}
		}
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i) );
		}
		

	}

}
