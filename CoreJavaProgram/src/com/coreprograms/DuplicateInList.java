package com.coreprograms;

import java.util.ArrayList;

public class DuplicateInList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);//0
		al.add(45);//1
		al.add(23);//2
		al.add(1);//3
		al.add(45);//4
		
		
		int q = 0;
		
		for(int i=0;i<al.size();i++) {

			for(int j=0;j<al.size();j++) {
				if(al.get(i)==al.get(j)) {
     				q += 1;
					System.out.println(al.get(i) + " is index at " +  j );	
					System.out.println(al.get(i) + " is " +  q + " times repeated");
			   }
			}
			System.out.println(al.get(i) + " is " +  q + " times repeated");
		q = 0;
			
		}

	}

}
