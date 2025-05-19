class Solution {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i=0; i<n; i++){
            boolean[] rowCheck = new boolean[n]; //[false,false,false]
            boolean[] colCheck = new boolean[n]; //[false,false,false]

            for(int j=0; j<n; j++){
                int rowVal = matrix[i][j];
                if(rowVal<1 || rowVal>n || rowCheck[rowVal - 1]){
                    return false;
                }
                rowCheck[rowVal - 1] = true; //-> [true,false,false]

                int colVal = matrix[j][i];
                if(colVal<1 || colVal>n || colCheck[colVal - 1]){
                    return false;
                }
                colCheck[colVal - 1] = true;
            }
    
        }

        return true;
    }
}