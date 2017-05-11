/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 3 - Mergsort"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/4E9fa/lecture-slides
 */


public class MergeSort {
	public static void merge(Comparable[] a, int lo, int mid, int hi) {
		Comparable[] aCopy = new Comparable[a.length];
		for (int k = lo; k <= hi; k++) {
			aCopy[k] = a[k];
		}

		/* "i" points to the first element in the left array that has not yet been merged */
		int i = lo;

		/* "j" points to the first element in the right array that has not yet been merged */
		int j = mid + 1;

		for (int k = lo; k <= hi; k++) {
			if (i > mid) {
				// The left array has already been exhausted
				a[k] = aCopy[j++];
			} else if (j > hi) {
				// The right array has already been exhausted
				a[k] = aCopy[i++];
			} else {
				// Choose whichever element is less i or j
				if (less(aCopy[j], aCopy[i])) {
					a[k] = aCopy[j++];
				} else {
					a[k] = aCopy[i++];
				}
			}
		}
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
}