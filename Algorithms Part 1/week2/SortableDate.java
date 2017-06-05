/**
 * These are notes taken during the lecture below:
 * Lecture: "Week 2 - Elementary Sorts"
 * Course: "Algorithms Part-1" on Coursera
 * url: https://www.coursera.org/learn/algorithms-part1/supplement/erHuw/lecture-slides
 */


public class SortableDate implements Comparable<SortableDate> {
    private final int month, day, year;

    public SortableDate(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /**
     * Implements Comparable.compareTo; compares this date
     * to that date and informs whether this one is Less (-1),
     * Greater (1) or Equal(0).
     */
    public int compareTo(SortableDate that) {
        if (this.year < that.year) return -1;
        if (this.year > that.year) return 1;
        if (this.month < that.month) return -1;
        if (this.month > that.month) return 1;
        if (this.day < that.day) return -1;
        if (this.day > that.day) return 1;
        return 0;
    }
}