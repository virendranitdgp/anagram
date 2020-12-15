package com.demo.series;

import java.util.ArrayList;

/* Write a function, which given a finite array of words, 
/ returns a 2-dimensional array which contains sets of words grouped 
as anagrams
# Anagram - A word formed from another by rearranging its letters
arr_in = [add, dad, god, dog, vile, live, evil, odd]
arr_out = groupAsAnagrams(arr_in)
# expected result for arr_out = [[add, dad], [dog, god], [vile, live, evil], [odd]]
*/

public class Main {
	
	public static boolean isAnagram(String str1, String str2) {
		
		if(str1==null || str2==null) {
			return false;
		}
		
		int arr1[]=new int[26];
		int arr2[]=new int[26];
		for(int i=0;i<str1.length();i++)
			arr1[str1.charAt(i)-'a']=arr1[str1.charAt(i)-'a']+1;
		
		for(int i=0;i<str2.length();i++)
			arr2[str2.charAt(i)-'a']=arr2[str2.charAt(i)-'a']+1;
		System.out.println();
		
		
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String strArray[]= {"add", "dad", "god", "dog", "vile", "live", "evil", "odd"};
		
		
		ArrayList<ArrayList<String>> res=new ArrayList<ArrayList<String>>();
		
		for(int i=0;i<strArray.length;i++) {
			ArrayList<String> newAnagram=new ArrayList<String>();
			for(int j=i;j<strArray.length;j++) {		
				if(isAnagram(strArray[i], strArray[j])) {
					newAnagram.add(strArray[j]);
			         if(i!=j) {
			        	 strArray[j]=null;
			         }
				}
				
			}
			if(!newAnagram.isEmpty()) {
			   res.add(newAnagram);
			}
		}
		System.out.println(res);
		
		
	}
	

}

