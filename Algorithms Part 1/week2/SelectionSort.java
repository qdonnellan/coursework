/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 2 - Elementary Sorts"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/UAJbP/lecture-slides
 */

public class SelectionSort {
    public static void sort(Comparable[] a) {
        int size = a.length;
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Swap elements of array "a" in locations "i" and "j"
     */
    private static void swap(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;;
    }
}