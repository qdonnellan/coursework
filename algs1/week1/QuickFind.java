/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 1 - Union Find"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/bcelg/lecture-slides
 */


public class QuickFind {
	private int[] id;

	public QuickFind(int size) {
		id = new int[size];
		for (int i = 0; i < size; i++) {
			id[i] = i;
		}
	}

	/* Check whether p is connected to q */
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

	/* Connect p with q */
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++) {
			if (id[i] == pid) {
				id[i] = qid;
			}
		}
	}
}