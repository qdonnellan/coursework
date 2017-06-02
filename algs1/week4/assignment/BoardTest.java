import static org.junit.Assert.*;
import org.junit.Test;


public class BoardTest {

    @Test
    public void test_initially_goal_board() {
        int[][] blocks = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
        };
        Board board = new Board(blocks);
        assertEquals(3, board.dimension());
        assertEquals(0, board.hamming());
        assertEquals(0, board.manhattan());
        assertTrue(board.isGoal());
    }

    @Test
    public void test_one_step_away() {
        int[][] blocks = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 0, 8}
        };
        Board board = new Board(blocks);
        assertEquals(1, board.hamming());
        assertEquals(1, board.manhattan());
        assertFalse(board.isGoal());
    }

    @Test
    public void test_not_equals() {
        int[][] blocks1 = new int[][]{
            {1, 3, 2}, // 3 and 2 swapped
            {4, 5, 6},
            {7, 8, 0}
        };
        int[][] blocks2 = new int[][]{
            {1, 2, 3},
            {4, 6, 5},  // 6 and 5 swapped
            {7, 8, 0}
        };
        Board b1 = new Board(blocks1);
        Board b2 = new Board(blocks2);
        assertFalse(b1.hashCode() == b2.hashCode());
        assertFalse(b1.equals(b2));
    }

    @Test
    public void test_equals() {
        int[][] blocks1 = new int[][]{
            {1, 3, 2},
            {4, 5, 6},
            {7, 8, 0}
        };
        int[][] blocks2 = new int[][]{
            {1, 3, 2},
            {4, 5, 6},
            {7, 8, 0}
        };
        Board b1 = new Board(blocks1);
        Board b2 = new Board(blocks2);
        assertTrue(b1.equals(b2));
    }

    @Test
    public void test_twin() {
        int[][] blocks1 = new int[][]{
            {1, 3, 2},
            {4, 5, 6},
            {7, 8, 0}
        };
        Board b1 = new Board(blocks1);
        Board b2 = b1.twin();
        assertFalse(b1.equals(b2));
    }

    @Test
    public void count_neighbors() {
        int[][] blocks = new int[][]{
            {1, 3, 2},
            {4, 5, 6},
            {7, 8, 0}
        };
        Board board = new Board(blocks);
        int count = 0;
        for (Board b: board.neighbors()) {
            count++;
            assertFalse(b.equals(board));
        }
        assertEquals(2, count);
    }

    @Test
    public void count_neighbors_again() {
        int[][] blocks = new int[][]{
            {1, 3, 2},
            {4, 0, 6},
            {7, 8, 5}
        };
        Board board = new Board(blocks);
        int count = 0;
        for (Board b: board.neighbors()) {
            count++;
            assertFalse(b.equals(board));
        }
        assertEquals(4, count);
    }

    @Test
    public void test_known_manhattan() {
        int[][] blocks = new int[][]{
            {0, 1, 3},
            {4, 2, 5},
            {7, 8, 6}
        };
        Board board = new Board(blocks);
        assertEquals(4, board.manhattan());
    }

    @Test
    public void test_another_known_manhattan() {
        int[][] blocks = new int[][]{
            {5, 8, 7},
            {1, 4, 6},
            {3, 0, 2}
        };
        Board board = new Board(blocks);
        assertEquals(17, board.manhattan());
    }
}