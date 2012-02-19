package model;

import java.util.*;

public class QuickSort {
	public static void quick_sort(Vector<ColVal> field){
		quick_sort_help(field, 0, field.size()-1);
	}
	
	static void quick_sort_help(Vector<ColVal> field, int iLeft, int iRight){
		final ColVal MID = field.get((iLeft + iRight)/2); 
				
		int l = iLeft;
		int r = iRight;
		
		while(l < r){
			while(field.get(l).count < MID.count)
				++l;
			while(field.get(r).count > MID.count)
				--r;
			if(l <= r)
				swap(field, l++, r--);
		}
		if(iLeft < r) 
			quick_sort_help(field, iLeft, r);
		if(iRight > l)
			quick_sort_help(field, l, iRight);
		
	}
	
	static void swap(Vector<ColVal> field, int l, int r){
		ColVal temp = field.get(l);
		field.set(l, field.get(r));
		field.set(r, temp);
	}
}
