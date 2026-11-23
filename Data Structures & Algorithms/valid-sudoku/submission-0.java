class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                if(board[r][c] != '.'){
                    int idx = board[r][c] - '1';
                    int b = ((r/3)*3) + (c/3);

                    if((row[r][idx] == true) || (col[c][idx] == true) || (box[b][idx] == true)){
                        return false;
                    }
                    else{
                        row[r][idx] = col[c][idx] = box[b][idx] = true;
                    }
                }
            }
        }
        return true;
    }
}