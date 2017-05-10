/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 3 - Mergsort"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/4E9fa/lecture-slides
 */


public class Merge {

	/**
	 * Merge pre-sorted a into pre-sorted b. This is slightly differen than what is
	 * presented in the lectures; in this case a and b are 2 different, pre-sorted
	 * arrays and we just want to return a final combined array.
	 */
	public static Integer[] merge(Integer[] a, Integer[] b) {
		int ai = 0;
		int bi = 0;
		Integer[] c = new Integer[a.length + b.length];
		for (int i = 0; i < c.length; i++) {
			if (ai < a.length && (a[ai] <= b[bi] || bi > b.length)) {
				c[i] = a[ai++];
			} else {
				c[i] = b[bi++];
			}
		}
		return c;
	}
}