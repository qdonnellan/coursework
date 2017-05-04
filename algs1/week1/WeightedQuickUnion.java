public class WeightedQuickUnion {
    private int[] id;
    private int[] treeSize;

    public WeightedQuickUnion(int size) {
        id = new int[size];
        for (int i = 0; i < size; i++) {
            id[i] = i;
            treeSize[i] = 1;
        }
    }

    /* For a given element's index, find the index of that element's root. */
    private int root(int i) {
        while (i != id[i]) {
            id[i] = id[id[i]]; // Path compression!
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
        if (treeSize[i] == treeSize[j]) {
            /* If the trees are the same size, do nothing */
            return;
        } else if (treeSize[i] < treeSize[i]) {
            /* If tree "J" is bigger, then add tree "I" to tree "J" */
            id[i] = j;
            treeSize[j] += treeSize[i];
        } else {
            /* If tree "I" is bigger, then add tree "J" to tree "I" */
            id[j] = i;
            treeSize[i] += treeSize[j];
        }
    }
}