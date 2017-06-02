import static org.junit.Assert.*;
import org.junit.Test;


public class SolverTest {

    @Test
    public void test_initialization_of_solver() {
        int[][] blocks = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 0}
        };
        Board board = new Board(blocks);
        Solver solver = new Solver(board);
        assertTrue(solver.isSolvable());
        assertEquals(0, solver.moves());
    }

    @Test
    public void test_one_move_solution() {
        int[][] blocks = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {7, 0, 8}
        };
        Board board = new Board(blocks);
        Solver solver = new Solver(board);
        assertEquals(1, solver.moves());
    }

    @Test
    public void test_two_move_solution() {
        int[][] blocks = new int[][]{
            {1, 2, 3},
            {4, 0, 6},
            {7, 5, 8}
        };
        Board board = new Board(blocks);
        Solver solver = new Solver(board);

        for (Board b: solver.solution()) {
            System.out.println(b.toString());
        }
        assertEquals(2, solver.moves());
    }

    @Test
    public void test_unsolvable_initial_board() {
        int[][] blocks = new int[][]{
            {1, 2, 3},
            {4, 5, 6},
            {8, 7, 0}
        };
        Board board = new Board(blocks);
        Solver solver = new Solver(board);
        assertFalse(solver.isSolvable());
    }
}