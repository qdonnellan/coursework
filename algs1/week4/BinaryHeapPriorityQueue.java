public class BinaryHeapPriorityQueue<Item extends Comparable<Item>> {
    private Item[] items;
    private int size;

    BinaryHeapPriorityQueue(int capacity) {
        items = (Item[]) new Comparable[capacity + 1];
    }

    public void insert(Item item) {
        items[++size] = item;
        swim(size);
    }

    public Item deleteMax() {
        Item max = items[1];      // get the value of the first item
        swap(1, size--);          // swap the first item with the last item, decrement size
        sink(1);                  // sink the new first item to it's proper place in the heap
        items[size + 1] = null;   // set the last item to null to prevent loitering
        return max;               // return the value of the first item
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Take the item at position k and swim up up to the highest point in the heap
     * where it is no longer larger than it's parent.
     */
    private void swim(int k) {
        while (k > 1 && less(k / 2, k)) {
            swap(k, k / 2);
            k = k / 2;
        }
    }

    /**
     * Take the item at position "k" and sink it to the lowest point in the heap where
     * it is no longer smaller than it's children
     */
    private void sink(int k) {
        while (2 * k <= size) {
            int j = 2 * k;
            if (j < size && less(j, j + 1)) {
                j++;
            }
            if (!less(k, j)) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    private boolean less(int a, int b) {
        return items[a].compareTo(items[b]) < 0;
    }

    /**
     * Swap elements in the heap in locations "i" and "j"
     */
    private void swap(int i, int j) {
        Item tmp = items[i];
        items[i] = items[j];
        items[j] = tmp;
    }
}