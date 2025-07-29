class Solution {
    List<List<String>> result;

    public List<List<String>> solveNQueens(int n) {
        result = new ArrayList<>();
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        // Start DFS from row 0
        List<int[]> queens = new ArrayList<>();
        dfs(board, 0, queens);
        return result;
    }

    private void dfs(char[][] board, int r, List<int[]> queens) {
        if (r == board.length) { // base case: all rows are filled
            List<String> rows = new ArrayList<>();
            for (char[] row : board) {
                rows.add(new String(row));
            }
            result.add(rows);
            return; // Don't forget this!
        }

        for (int c = 0; c < board.length; c++) {
            if (canAdd(r, c, queens)) {
                board[r][c] = 'Q';
                queens.add(new int[] { r, c });

                dfs(board, r + 1, queens);

                // Backtrack
                board[r][c] = '.';
                queens.remove(queens.size() - 1);
            }
        }
    }

    private boolean canAdd(int r, int c, List<int[]> queens) {
        for (int[] q : queens) {
            int qRow = q[0], qCol = q[1];

            // Same column or diagonal
            if (qCol == c || qRow + qCol == r + c || qRow - qCol == r - c) {
                return false;
            }
        }
        return true;
    }
}
