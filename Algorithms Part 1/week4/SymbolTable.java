/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 4 - Elementary Symbol Tables"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/2kwpU/lecture-slides
 */



// Associative array abstraction.
public class SymbolTable<Key extends Comparable<Key>, Value> {
    private Key[] keys;
    private Value[] vals;
    private int size;


    public void put(Key key, Value val) {
        return;
    }

    public Value get(Key key) {
        if(isEmpty()) return null;
        int i = rank(key);
        if (i < size && keys[i].compareTo(key) == 0) {
            return vals[i];
        } else {
            return null;
        }
    }

    // Just a binary search
    private int rank(Key key) {
        int lo = 0;
        int hi = size - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cmp = key.compareTo(keys[mid]);
            if (cmp < 0) {
                hi = mid - 1;
            } else if (cmp > 0) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return lo;
    }

    public void delete(Key key) {
        put(key, null);
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public boolean isEmpty() {
        // Need to implement
        return true;
    }

    public int size() {
        return size;
    }

    public Iterable<Key> keys() {
        // Need to implement.
        return null;
    }
}