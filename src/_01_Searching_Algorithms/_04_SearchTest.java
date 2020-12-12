package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] arr1 = {"red", "yellow", "green", "blue"};
		assertEquals(2, _00_LinearSearch.linearSearch(arr1, "green"));

		String[] arr2 = {"Rey", "Julia", "Wendy", "Shiva"};
		assertEquals(3, _00_LinearSearch.linearSearch(arr2, "Shiva"));

		String[] arr3 = {"chocolate", "vanilla", "caramel", "coffee"};
		assertEquals(1, _00_LinearSearch.linearSearch(arr3, "vanilla"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] arr1 = {3, 6, 9, 12, 15};
		assertEquals(2, _01_BinarySearch.binarySearch(arr1, 0, 4, 9));

		int[] arr2 = {1, 2, 4, 8, 16};
		assertEquals(3, _01_BinarySearch.binarySearch(arr2, 0, 4, 8));

		int[] arr3 = {100, 200, 300, 400, 500};
		assertEquals(4, _01_BinarySearch.binarySearch(arr3, 0, 4, 500));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] arr1 = {2, 4, 6, 8};
		assertEquals(1, _02_InterpolationSearch.interpolationSearch(arr1, 4));

		int[] arr2 = {30, 60, 90, 120};
		assertEquals(2, _02_InterpolationSearch.interpolationSearch(arr2, 90));

		int[] arr3 = {1, 2, 3, 4, 5};
		assertEquals(3, _02_InterpolationSearch.interpolationSearch(arr3, 4));
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] arr1 = {3, 7, 12, 54, 61};
		assertEquals(3, _03_ExponentialSearch.exponentialSearch(arr1, 54));

		int[] arr2 = {9, 18, 36, 54, 63};
		assertEquals(4, _03_ExponentialSearch.exponentialSearch(arr2, 63));

		int[] arr3 = {2, 6, 7, 8, 9};
		assertEquals(2, _03_ExponentialSearch.exponentialSearch(arr3, 7));
	}
}
