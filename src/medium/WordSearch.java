package medium;

public class WordSearch {

        private boolean result = false;

        public boolean exist(char[][] board, String word) {
            //we should have some path that checks if the cell was visited
            boolean[][] visited = new boolean[board.length][board[0].length];

            backtrack(new StringBuilder(), word, 0, 0, board, visited, 0);
            return result;
        }


        private void backtrack (StringBuilder sb, String word, int lastI, int lastJ, char[][] board, boolean[][] visited, int wordIndex) {
            //if indicies are bigger or equal to the length then we are out of board
            if (lastI >= board.length || lastI < 0 || lastJ >= board[0].length || lastJ < 0 || visited[lastI][lastJ] == true || wordIndex >= word.length()) return;
            if (result) return;


            if (sb.length() == word.length()) {
                result = true;
                return;
            }

            if (board[lastI][lastJ] != word.charAt(wordIndex)) {
                visited = new boolean[board.length][board[0].length];
                backtrack(new StringBuilder(), word, lastI + 1, lastJ, board, visited, 0);

                visited = new boolean[board.length][board[0].length];
                backtrack(new StringBuilder(), word, lastI, lastJ + 1, board, visited, 0);
                visited = new boolean[board.length][board[0].length];
                backtrack(new StringBuilder(), word, lastI - 1 , lastJ + 1, board, visited, 0);

                return;
            }


            sb.append(board[lastI][lastJ]);
            // Go to the left (lastI, lastJ - 1)
            visited[lastI][lastJ] = true;

            backtrack(new StringBuilder(sb), word, lastI, lastJ - 1, board, visited, wordIndex + 1);

            // Go to the right (lastI, lastJ + 1)
            if (!result) {
                backtrack(new StringBuilder(sb), word, lastI, lastJ + 1, board, visited, wordIndex + 1);
            }
            // Go down (lastI + 1, lastJ)
            if (!result) {
                backtrack(new StringBuilder(sb), word, lastI + 1, lastJ, board, visited, wordIndex + 1);
            }
            visited[lastI][lastJ] = false;


        }

}
