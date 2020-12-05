package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
    public BogoSorter() {
        type = "Bogo";
    }

    // Bogo sort is a joke sorting algorithm. It is considered the most
    // inefficient sorting algorithm while still maintaining the possibility
    // of eventually sorting data.

    // It works by following these steps:
    // STEP 1. Is the array in order?
    //	if yes, finished; if no, go to step 2.
    // STEP 2. Take two random elements in the array and swap them.
    // STEP 3. Go back to step 1.

    //1. Complete the sort method using the Bogo sort algorithm.
    @Override
    void sort(int[] array, SortingVisualizer display) {
        Random rand = new Random();
        Random another = new Random();
        while (sorted(array) == false) {
            for (int i = 0; i < array.length-1; i++) {
                int r = rand.nextInt(array.length);
                int a = another.nextInt(array.length);
                int swap = array[a];
                array[a] = array[r];
                array[r] = swap;
                display.updateDisplay();
            }
        }
    }

    boolean sorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
