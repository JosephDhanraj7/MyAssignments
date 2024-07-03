package week2.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SecondLargestList {
	
	public static void main(String[] args) {
		
		int[] arr = { 3, 2, 11, 4, 6, 7 };
		
		Arrays.sort(arr);
		
		List<Integer> arrlist = new LinkedList<Integer>();
		for(int arr1:arr) {
			arrlist.add(arr1);
		}
		int size=arrlist.size();
		System.out.println(arrlist.get(size-2));
	}

}
