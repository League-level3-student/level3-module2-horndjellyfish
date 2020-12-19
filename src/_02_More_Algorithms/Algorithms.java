package _02_More_Algorithms;

import _00_Sorting_Algorithms.BubbleSorter;
import _01_Searching_Algorithms._00_LinearSearch;

import java.util.List;

public class Algorithms {
    public static int findBrokenEgg(List<String> eggs) {
        String[] arr = new String[eggs.size()];
        arr = eggs.toArray(arr);
        return _00_LinearSearch.linearSearch(arr, "cracked");
    }

    public static int countPearls(List<Boolean> oysters) {
        int n = 0;
        for (Boolean value : oysters) {
            if (value.booleanValue()) {
                n++;
            }
        }
        return n;
    }

    public static double findTallest(List<Double> peeps) {
        Double[] arr = new Double[peeps.size()];
        arr = peeps.toArray(arr);
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static String findLongestWord(List<String> words) {
        int l = 0;
        String longest = " ";
        for (String word : words) {
            if (word.length() > l) {
                l = word.length();
                longest = word;
            }
        }
        return longest;
    }

//    public static boolean containsSOS(List<String> message1) {
//        String[] arr = new String[message1.size()];
//        arr = message1.toArray(arr);
//
//        if (_00_LinearSearch.linearSearch(arr, "...---...") == -1) {
//            return false;
//        }
//        return true;
//    }

    public static double sortScores(List<Double> results) {

        return 0;
    }






}
