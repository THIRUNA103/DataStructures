package com.naren.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySeachIteration {
	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70));
		
		int start=0;
		int end=l.size()-1;
		int number=500;
		int mid=(start+end)/2;
		while(start<=end) {
			if(number==l.get(mid)) {
				System.out.println(mid+1);
				break;
			}else {
				if(number>l.get(mid)) {
					start=mid+1;
				}else {
					end=mid-1;
				}
			}
			mid=(start+end)/2;
		}
		System.out.println("end");
		
	}

}
