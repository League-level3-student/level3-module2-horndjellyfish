package _02_More_Algorithms;

import _00_Sorting_Algorithms.*;
import _01_Searching_Algorithms._00_LinearSearch;

import java.util.Arrays;
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

    public static boolean containsSOS(List<String> message) {
        CharSequence s = "... --- ...";
        return message.contains(s);
    }

    public static List<Double> sortScores(List<Double> results) {
        Double[] arr = new Double[results.size()];
        arr = results.toArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double k = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = k;
                    results = Arrays.asList(arr);
                }
            }
        }
        return results;
    }

    public static List<String> sortDNA(List<String> sequences) {
        String[] arr = new String[sequences.size()];
        arr = sequences.toArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[i].length() > arr[j].length()) {
                    String k = arr[j];
                    arr[j] = arr[i];
                    arr[i] = k;
                }
            }
        }
        sequences = Arrays.asList(arr);
        return sequences;
    }


}
