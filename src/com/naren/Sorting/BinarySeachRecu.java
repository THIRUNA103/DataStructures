package com.naren.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySeachRecu {
	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
		
		int start=0;
		int end=l.size()-1;
		
		
		int number=100;
		int search = search(l,start,end,number);
		System.out.println((search +1));
		
	}

	private static int search(List<Integer> l, int start, int end, int number) {
		
		
		if(end >=start) {
			int mid=(start+end)/2;
			if(number == l.get(mid)) {
				return mid;
			}else {
				if(number > l.get(mid)) {
					start=mid+1;
					return search(l,start,end,number);
				}else {
					return search(l,start,(mid-1),number);
				}
			}
			
			
		}else {
			return -1;
		}
	
		
		
	}

}
