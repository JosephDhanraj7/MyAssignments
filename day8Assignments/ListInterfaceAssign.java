package week2.day4;

import java.util.ArrayList;
import java.util.List;

public class ListInterfaceAssign {
	public static void main(String[] args) {
		
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		for (int arr : arr1) {
			a.add(arr);

		}
		// System.out.println(a);
		for (int arr : arr2) {
			b.add(arr);

		}
		// System.out.println(b);
		for (int i = 0; i <= a.size() - 1; i++) {
			// System.out.println(a.get(0));
			for (int j = 0; j <= b.size() - 1; j++) {
				if (a.get(i).equals(b.get(j))) {
					System.out.println(a.get(i));
				}
			}
		}

	}

}
