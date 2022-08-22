// Name: Deziallia Morris

package com.dezji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static java.lang.System.out;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < 10; i++)
			list.add((int) (Math.random() * 10) + 1);
		
		Collections.sort(list);
		
		out.println("The list is: " + list);
		
		int index = binarySearch(list, 5);
		
		if (index >= 0)
			out.print("Binary search: the number 5 was found at index " + index);
		else
			out.println("Binary search: the number 5 was not found");
		
		
		
		List<String> names = new ArrayList<>();
		
		names.add("Rue");
		names.add("Nate");
		names.add("Cassie");
		names.add("Maddy");
		names.add("Cal");
		names.add("Jules");
		names.add("Gia");
		names.add("Fezco");
		
		Collections.sort(names);
		
		out.println("\nThe names are: " + names);
		
		index = binarySearch(names, "Gia");
		
		if( index >= 0)
			out.print("The name Gia was found at " + index);
		else
			out.print("The name Gia was not found");
		
		
		
		

	}
	private static <E extends Comparable<E>> int binarySearch(List<E> list, E data) {
		int U = list.size() - 1;
		int L = 0;
		
		while (U != L) {
			int M = (U + L) / 2;
			
			E middleList = list.get(M);
			int compareResult = middleList.compareTo(data);
			
			if (compareResult < U) {
				U = M - 1;
				}
			
			if (compareResult > L)
				L = M + 1;
			else
				return M;
		}
		
		return -1;
	}
}