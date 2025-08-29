class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length; 
        int m = matrix[0].length;
        int row = 0;
        int column =  m - 1;
        while(column >= 0 && row < n){
            if(matrix[row][column] == target) return true;
            else if(matrix[row][column] < target ){ 
                row++;
            }
            else  {
                column--; 
            }    
        } 
        return false;
    }
}