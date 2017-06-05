/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 4 - Priority Queues"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/eHe3d/lecture-slides
 */


public class BinarySearchTree<Key extends Comparable<Key>, Value> {

    private Node root;

    public BinarySearchTree() {

    }

    public Value get(Key key) {
        Node x = root;
        while (x != null) {
            int cmp = key.compareTo(x.key);
            if (cmp < 0) {
                x = x.left;
            } else if (cmp > 0) {
                x = x.right;
            } else {
                return x.value;
            }
        }
        return null;
    }

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null) {
            // We've reached a null leaf; create a new node here!
            return new Node(key, value, 1);
        }
        int cmp = key.compareTo(x.key);
        if (cmp < 0) {
            // The key's value belongs in the left subtree
            x.left = put(x.left, key, value);
        } else if (cmp > 0) {
            // The key's value belongs in the right subtree
            x.right = put(x.right, key, value);
        } else {
            // This key belongs on this node
            x.value = value;
        }
        x.count = 1 + size(x.left) + size(x.right);
        return x;
    }

    /**
     * Find the key just "below" the given key. 
     */
    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null) {
            return null;
        }
        return x.key;
    }

    private Node floor(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp == 0) {
            return x;
        }
        if (cmp < 0) {
            return floor(x.left, key);
        }
        Node t = floor(x.right, key);
        if (t != null) {
            return t;
        } else {
            return x;
        }
    } 

    public int size() { 
        return size(root); 
    }

    private int size(Node x) {
        if (x == null) {
            return 0;
        }
        return x.count;
    }

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;
        private int count;

        public Node(Key key, Value value, int count) {
            this.key = key;
            this.value = value;
            this.count = count;
        }
    }
}