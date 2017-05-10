/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 2 - Stacks and Queues"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/UAJbP/lecture-slides
 */

/**
 * ClassRoster is a stack implementation holding a record of all students in
 * a class. It's completely useless.
 */
import java.util.Iterator;

public class ClassRoster<Student> implements Iterable<Student> {
    private Node first = null;

    private class Node {
        Student student;
        Node next;

        public Node(Student student, Node next) {
            this.student = student;
            this.next = next;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void push(Student student) {
        first = new Node(student, first);
    }

    public Student pop() {
        Student student = first.student;
        first = first.next;
        return student;
    }


    public Iterator<Student> iterator() {
        return new ClassRosterIterator();
    }

    private class ClassRosterIterator implements Iterator<Student> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        public Student next() {
            Student student = current.student;
            current = current.next;
            return student;
        }
    }

}