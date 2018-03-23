package com.practice.all;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args){
		String s ="cat";
		String s1 = "tac";
		boolean b = areAnagram(s, s1);
		if(b)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	static boolean areAnagram(String s, String s1){
		char[] sarr  = s.toCharArray();
		char[] sarr1 = s1.toCharArray();
	
		Arrays.sort(sarr);
		Arrays.sort(sarr1);
		
		for(int i=0 ; i<=sarr.length-1 && i<=sarr1.length-1; i++){
			if(sarr[i]==sarr1[i])
				continue;
			else
				return false;
		}
		return true;
	
		
	}
}
