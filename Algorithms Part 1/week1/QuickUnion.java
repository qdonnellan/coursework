/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 1 - Union Find"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/bcelg/lecture-slides
 */


public class QuickUnion {
    private int[] id;

    public QuickUnion(int size) {
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
        }
    }

    /* For a given element's index, find the index of that element's root. */
    private int root(int i) {
        while (i != id[i]) {
            i = id[i];
        }
        return i;
    }

    /* If two elements share the same root, they are connected */
    public boolean connected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        id[i] = j;
    }
}