class Solution {
    public boolean exist(char[][] board, String word) {
        //convert the string to char array for easy access
        char[] wordArray = word.toCharArray();

        //iterate through each cell in the grid
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                //start the backtracking from the current cell
                if(backtrack(board,i,j,wordArray,0)){
                    return true; //word found
                }
            }
        }
        return false; //word not found 
    }
    //backtracking method
    private boolean backtrack(char[][] board,int i,int j,char[] word,int index){
        //check if we have found the word
        if(index == word.length){
            return true;
        }
        //check if the curr cell is out of bounds, or the char doesn't match
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word[index]){
            return false;
        } 
        //temporarily mark the curr cell as visited
        char temp =board[i][j];
        board[i][j] = '*';

        //explore adjacent cells in all directions
        boolean result = (backtrack(board,i+1,j,word,index+1) ||
                          backtrack(board,i-1,j,word,index+1) ||
                          backtrack(board,i,j+1,word,index+1) ||
                          backtrack(board,i,j-1,word,index+1));
        
        //restore the original value of the curr cell
        board[i][j] = temp;
        return result;
    }
}