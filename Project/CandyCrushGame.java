import java.util.ArrayList;
import java.util.List;

public class CandyCrushGame {

    private int[][] board;
    private int rows;
    private int cols;

    public CandyCrushGame(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.board = new int[rows][cols];
        // Initialize board with random candy types (e.g., 1-5)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = (int) (Math.random() * 5) + 1;
            }
        }
    }

    // Method to check for horizontal matches of 3 or more
    public List<int[]> findHorizontalMatches() {
        List<int[]> matches = new ArrayList<>();
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c <= cols - 3; c++) {
                if (board[r][c] == board[r][c + 1] && board[r][c] == board[r][c + 2]) {
                    // Found a match of 3
                    matches.add(new int[]{r, c});
                    matches.add(new int[]{r, c + 1});
                    matches.add(new int[]{r, c + 2});
                    // Extend to find longer matches
                    int currentC = c + 3;
                    while (currentC < cols && board[r][c] == board[r][currentC]) {
                        matches.add(new int[]{r, currentC});
                        currentC++;
                    }
                    c = currentC - 1; // Adjust c to avoid rechecking the same match
                }
            }
        }
        return matches;
    }

    // Method to check for vertical matches of 3 or more
    public List<int[]> findVerticalMatches() {
        List<int[]> matches = new ArrayList<>();
        for (int c = 0; c < cols; c++) {
            for (int r = 0; r <= rows - 3; r++) {
                if (board[r][c] == board[r + 1][c] && board[r][c] == board[r + 2][c]) {
                    // Found a match of 3
                    matches.add(new int[]{r, c});
                    matches.add(new int[]{r + 1, c});
                    matches.add(new int[]{r + 2, c});
                    // Extend to find longer matches
                    int currentR = r + 3;
                    while (currentR < rows && board[r][c] == board[currentR][c]) {
                        matches.add(new int[]{currentR, c});
                        currentR++;
                    }
                    r = currentR - 1; // Adjust r to avoid rechecking the same match
                }
            }
        }
        return matches;
    }

    // Placeholder for clearing matches (setting to 0 or a special value)
    public void clearMatches(List<int[]> matches) {
        for (int[] coord : matches) {
            board[coord[0]][coord[1]] = 0; // Clear the candy
        }
    }

    // Placeholder for refilling the board after clearing
    public void refillBoard() {
        // Implement logic to drop candies down and fill new ones from the top
        // This is more complex and would involve shifting and generating new candies.
    }

    // Print the board (for demonstration)
    public void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CandyCrushGame game = new CandyCrushGame(8, 8); // 8x8 board
        System.out.println("Initial Board:");
        game.printBoard();

        List<int[]> horizontalMatches = game.findHorizontalMatches();
        if (!horizontalMatches.isEmpty()) {
            System.out.println("\nHorizontal Matches found:");
            for (int[] match : horizontalMatches) {
                System.out.println("Row: " + match[0] + ", Col: " + match[1]);
            }
            game.clearMatches(horizontalMatches);
            System.out.println("\nBoard after clearing horizontal matches:");
            game.printBoard();
        }

        List<int[]> verticalMatches = game.findVerticalMatches();
        if (!verticalMatches.isEmpty()) {
            System.out.println("\nVertical Matches found:");
            for (int[] match : verticalMatches) {
                System.out.println("Row: " + match[0] + ", Col: " + match[1]);
            }
            game.clearMatches(verticalMatches);
            System.out.println("\nBoard after clearing vertical matches:");
            game.printBoard();
        }

        // In a real game, you would then refill the board and continue checking for cascades.
    }
}