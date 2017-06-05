/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 4 - Priority Queues"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/eHe3d/lecture-slides
 */



/**
 * This is an unordered array implementation of a priority queue
 */
public class MaxPriorityQueue<Item extends Comparable<Item>> {
    private int size;
    private Item[] queue;

    MaxPriorityQueue(int capacity) {
        size = 0;
        queue = (Item[]) new Comparable[capacity];

    }

    void insert(Item item) {
        queue[size++] = item;
    }

    Item deleteMax() {
        int max = 0;
        for (int i = 1; i < size; i++) {
            if (less(max, i)) {
                max = i;
            }
            
            swap(max, size - 1);
        }
        return queue[--size];
    }

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    private boolean less(int a, int b) {
        return queue[a].compareTo(queue[b]) < 0;
    }

    /**
     * Swap elements in the queue in locations "i" and "j"
     */
    private void swap(int i, int j) {
        Item tmp = queue[i];
        queue[i] = queue[j];
        queue[j] = tmp;
    }
}