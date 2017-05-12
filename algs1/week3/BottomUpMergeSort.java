/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 3 - Mergsort"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/4E9fa/lecture-slides
 */



/**
 * Like the normal merge sort, but iterates through the array in increasingly 
 * larger windows instead of using recusion
 */
public class BottomUpMergeSort {
    public static void mergeSort(Comparable[] a) {
        int size = a.length;
        Comparable[] aCopy = new Comparable[size];
        for (int s = 1; s < size; s = s + s) {
            for (int lo = 0; lo < size - s; lo += s + s) {
                MergeSort.merge(a, aCopy, lo, lo + s - 1, Math.min(lo + s + s - 1, size - 1));
            }
        }
    }
}