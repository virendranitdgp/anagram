package com.demo.series;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramList {
	
	public static ArrayList<ArrayList<String>> angramList(String arr[]){
		
		HashMap <String, ArrayList<String>> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			String w=arr[i];
			char [] letters=w.toCharArray();
			Arrays.sort(letters);
			String newWord= new String(letters);
			
			if(map.containsKey(newWord)) {
				map.get(newWord).add(w);
			}else {
				ArrayList<String> words=new ArrayList<String>();
				words.add(w);
				map.put(newWord, words);
			}
		}
		
		ArrayList<ArrayList<String>> res=new ArrayList<ArrayList<String>>();
		
		for(String s: map.keySet()) {
			ArrayList<String> v=map.get(s);
			if(v.size()>1) {
				res.add(v);
			}
		}
		
		return res;
		
	}
	public static void main(String[] args) {
		String strArray[]= {"add", "dad", "god", "dog", "vile", "live", "evil", "odd"};
		System.out.println(angramList(strArray));
		
	}

}
