package _02_More_Algorithms;

import _01_Searching_Algorithms._00_LinearSearch;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		String[] arr = new String[eggs.size()];
		arr = eggs.toArray(arr);
		return _00_LinearSearch.linearSearch(arr, "cracked");
	}

	public static int countPearls(List<Boolean> oysters) {
		Boolean[] arr = new Boolean[oysters.size()];
		arr = oysters.toArray(arr);
		
		return 0;
	}









}
